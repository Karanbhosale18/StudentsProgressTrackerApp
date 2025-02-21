package com.example.mainproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity7 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button btn;
    Spinner s1,s2;
    EditText s3;
    DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        s1=(Spinner)findViewById(R.id.s1);
        s2=(Spinner)findViewById(R.id.s2);
        s3=(EditText) findViewById(R.id.s3);
        btn=(Button)findViewById(R.id.btn);
        db= FirebaseDatabase.getInstance().getReference().child("STUDENT DETAILS");
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.std, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.medium, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter1);
        s2.setOnItemSelectedListener(this);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String p=s1.getContext().toString();
                String pp=s2.getContext().toString();
                String ppp=s3.getText().toString();
                data4 d=new data4(p,pp,ppp);
                db.child(ppp).setValue(d);
                Toast.makeText(MainActivity7.this, "SUBMITTED SUCCESSFULLY", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity7.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text= adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}