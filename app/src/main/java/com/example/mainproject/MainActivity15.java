package com.example.mainproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity15 extends AppCompatActivity {
EditText et1,et2,et3,et4;
Button btn;
DatabaseReference db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        et3=(EditText) findViewById(R.id.et3);
        et4=(EditText) findViewById(R.id.et4);
        btn=(Button) findViewById(R.id.btn);
        db= FirebaseDatabase.getInstance().getReference().child("FEEDBACK");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=et1.getText().toString();
                String email=et2.getText().toString();
                String subject=et3.getText().toString();
                String message=et4.getText().toString();
                feedback f=new feedback(name,email,subject,message);
                db.child(name).setValue(f);
                String EmailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                if(name.length()>=2 && email.matches(EmailValidation) && subject.length()>=2 && message.length()>=2) {
                    Toast.makeText(MainActivity15.this, "THANK YOU", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity15.this, "INVALID INFORMATION", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == (R.id.item1)) {
            Intent i1 = new Intent(MainActivity15.this, MainActivity14.class);
            startActivity(i1);
        } else if (item.getItemId() == R.id.item2) {
            Intent i2 = new Intent(MainActivity15.this, MainActivity15.class);
            startActivity(i2);
        } else if (item.getItemId() == R.id.item3) {
            Intent i3 = new Intent(MainActivity15.this, MainActivity16.class);
            startActivity(i3);
        }
        return super.onOptionsItemSelected(item);
    }
}