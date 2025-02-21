package com.example.mainproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {
    EditText et1, et2, et3, et4, et5, et6,et7;
    int no;
    Button btn,btn1;
    DatabaseReference db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        et6 = (EditText) findViewById(R.id.et6);
        et7=(EditText)findViewById(R.id.et7);
        btn = (Button) findViewById(R.id.btn);
        btn1=(Button)findViewById(R.id.btn1);
        db= FirebaseDatabase.getInstance().getReference().child("STUDENT REGISTRATION");
        if(checkPermission(Manifest.permission.SEND_SMS)){
            btn1.setEnabled(true);
        }else{
            ActivityCompat.requestPermissions(MainActivity5.this,new String[]{Manifest.permission.SEND_SMS},1);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = et1.getText().toString();
                String b = et2.getText().toString();
                String c = et3.getText().toString();
                String d = et4.getText().toString();
                String e = et5.getText().toString();
                String f = et6.getText().toString();
                String g=et7.getText().toString();
                data2 dd=new data2(a,b,c,e,g);
                if(Integer.parseInt(f)==no) {
                    String EmailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                    String PassValidation = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,16}$";
                    db.child(b).setValue(dd);
                    if (a.matches(EmailValidation) && b.length() >= 2 && c.matches(PassValidation) && d.equals(c) && e.length() >= 4 && f.length() >= 4) {
                        Toast.makeText(MainActivity5.this, "SIGN IN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity5.this, MainActivity7.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity5.this, "ENTER VALID INFORMATION", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity5.this, "INVALID CODE", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m = et7.getText().toString();
                Random r = new Random();
                no = r.nextInt(10000);
                String msg=("OTP is->"+no);

                Intent i2 = new Intent();
                PendingIntent pi = PendingIntent.getActivity(MainActivity5.this, 0, i2, PendingIntent.FLAG_IMMUTABLE);

                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(m, null, msg, pi, null);

                Toast.makeText(MainActivity5.this, "Message Sent Successfully", Toast.LENGTH_LONG).show();
            }
        });
    }
    public boolean checkPermission(String permission) {
        int check = ContextCompat.checkSelfPermission(this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }
}