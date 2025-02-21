package com.example.mainproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity20 extends AppCompatActivity {
    EditText et1,et2;
    Spinner spin1;
    CalendarView cal;
    DatabaseReference db;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        cal=(CalendarView) findViewById(R.id.cal);
        spin1=(Spinner)findViewById(R.id.spin1);
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.attendance, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapter1);


        btn=(Button) findViewById(R.id.btn);
        db= FirebaseDatabase.getInstance().getReference().child("STUDENT ATTENDANCE");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String p1=et1.getText().toString();
                String p2=et2.getText().toString();
                String p3=spin1.getContext().toString();
                data5 d=new data5(p1,p2,p3);
                db.child(p1).setValue(d);
                Toast.makeText(MainActivity20.this, "ATTENDANCE MARK", Toast.LENGTH_LONG).show();
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
            Intent i1 = new Intent(MainActivity20.this, MainActivity17.class);
            startActivity(i1);
        } else if (item.getItemId() == R.id.item2) {
            Intent i2 = new Intent(MainActivity20.this, MainActivity20.class);
            startActivity(i2);
        } else if (item.getItemId() == R.id.item3) {
            Intent i3 = new Intent(MainActivity20.this, MainActivity18.class);
            startActivity(i3);
        }else if (item.getItemId() == R.id.item4) {
            Intent i3 = new Intent(MainActivity20.this, MainActivity22.class);
            startActivity(i3);
        }else if (item.getItemId() == R.id.item5) {
            Intent i3 = new Intent(MainActivity20.this, MainActivity21.class);
            startActivity(i3);
        }
        return super.onOptionsItemSelected(item);
    }

}