package com.example.mainproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity6 extends AppCompatActivity {
    EditText et1, et2, et3, et4, et5;
    Button btn,btn1;
    DatabaseReference db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        btn = (Button) findViewById(R.id.btn);
        btn1=(Button)findViewById(R.id.btn1);
        db= FirebaseDatabase.getInstance().getReference().child("TEACHER REGISTRATION");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = et1.getText().toString();
                String b = et2.getText().toString();
                String c = et3.getText().toString();
                String d = et4.getText().toString();
                String e = et5.getText().toString();
                String EmailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                String PassValidation = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,16}$";
                data3 d3=new data3(a,b,c,e);
                db.child(b).setValue(d3);
                if (a.matches(EmailValidation) && b.length() >= 2 && c.matches(PassValidation) && d.equals(c) && e.length() >= 4) {
                    Toast.makeText(MainActivity6.this, "SIGN IN SUCCESSFULL", Toast.LENGTH_SHORT).show();

                    Intent intent=new Intent(MainActivity6.this,MainActivity17.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity6.this, "ENTER VALID INFORMATION", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent=new Intent(MainActivity6.this,MainActivity19.class);
            startActivity(intent);
            }
        });
    }

}