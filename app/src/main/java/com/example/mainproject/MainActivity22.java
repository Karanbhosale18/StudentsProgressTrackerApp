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

public class MainActivity22 extends AppCompatActivity {
Button sendbtn;
EditText et1,et2,et3,et4;
DatabaseReference db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
        sendbtn=(Button) findViewById(R.id.sendbtn);
        db= FirebaseDatabase.getInstance().getReference().child("REPORTS");
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                String s3=et3.getText().toString();
                String s4=et4.getText().toString();

                report r=new report(s1,s2,s3,s4);
                db.child(s2).setValue(r);
                Toast.makeText(MainActivity22.this,"SEND SUCCESSFULLY",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == (R.id.item1)) {
            Intent i1 = new Intent(MainActivity22.this, MainActivity17.class);
            startActivity(i1);
        } else if (item.getItemId() == R.id.item2) {
            Intent i2 = new Intent(MainActivity22.this, MainActivity20.class);
            startActivity(i2);
        } else if (item.getItemId() == R.id.item3) {
            Intent i3 = new Intent(MainActivity22.this, MainActivity18.class);
            startActivity(i3);
        }else if (item.getItemId() == R.id.item4) {
            Intent i3 = new Intent(MainActivity22.this, MainActivity22.class);
            startActivity(i3);
        }else if (item.getItemId() == R.id.item5) {
            Intent i3 = new Intent(MainActivity22.this, MainActivity21.class);
            startActivity(i3);
        }
        return super.onOptionsItemSelected(item);
    }
}