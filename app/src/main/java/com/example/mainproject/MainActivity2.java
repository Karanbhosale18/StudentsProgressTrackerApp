package com.example.mainproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {
    EditText et1,et2;
    Button btn1,btn2;

    DatabaseReference db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        db=FirebaseDatabase.getInstance().getReference().child("STUDENT REGISTRATION");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = et1.getText().toString();
                String str2 = et2.getText().toString();
              db.child(str1).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                  @Override
                  public void onComplete(@NonNull Task<DataSnapshot> task) {
                      String Username,Password;
                      Username=task.getResult().child("username").getValue().toString();
                      Password=task.getResult().child("password").getValue().toString();
                      if(str1.equals(Username) && str2.equals(Password))
                      {
                          Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                          startActivity(intent);
                          Toast.makeText(MainActivity2.this,"LOGIN SUCCESSFULLY",Toast.LENGTH_SHORT).show();
                      }
                      else{
                          Toast.makeText(MainActivity2.this,"INCORRECT ID/PASSWORD",Toast.LENGTH_SHORT).show();
                          Intent intent=new Intent(MainActivity2.this,MainActivity2.class);
                          startActivity(intent);
                      }
                  }
              });
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent=new Intent(MainActivity2.this,MainActivity4.class);
            startActivity(intent);
            }
        });
    }

}

