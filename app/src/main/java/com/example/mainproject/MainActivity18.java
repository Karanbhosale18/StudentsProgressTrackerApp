package com.example.mainproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

public class MainActivity18 extends AppCompatActivity {

    EditText dateET,noticeET;
    Button sendbtn;
    DatabaseReference db;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        dateET=(EditText) findViewById(R.id.dateET);
        noticeET=(EditText) findViewById(R.id.noticeET);
        sendbtn=(Button) findViewById(R.id.sendbtn);
        db= FirebaseDatabase.getInstance().getReference().child("NOTICES");

        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String date=dateET.getText().toString();
                String notice=noticeET.getText().toString();
                noticedata nd=new noticedata(date,notice);
                db.child(date).setValue(nd);
                Toast.makeText(MainActivity18.this,"NOTICE SEND SUCCESSFULLY",Toast.LENGTH_SHORT).show();
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
            Intent i1 = new Intent(MainActivity18.this, MainActivity17.class);
            startActivity(i1);
        } else if (item.getItemId() == R.id.item2) {
            Intent i2 = new Intent(MainActivity18.this, MainActivity20.class);
            startActivity(i2);
        } else if (item.getItemId() == R.id.item3) {
            Intent i3 = new Intent(MainActivity18.this, MainActivity18.class);
            startActivity(i3);
        }else if (item.getItemId() == R.id.item4) {
            Intent i3 = new Intent(MainActivity18.this, MainActivity22.class);
            startActivity(i3);
        }else if (item.getItemId() == R.id.item5) {
            Intent i3 = new Intent(MainActivity18.this, MainActivity21.class);
            startActivity(i3);
        }
        return super.onOptionsItemSelected(item);
    }
}