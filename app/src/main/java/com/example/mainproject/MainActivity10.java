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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {
    EditText c1, c2, c3, c4, c5,c6;
    float per;
    TextView tv1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        c1 = (EditText) findViewById(R.id.c1);
        c2 = (EditText) findViewById(R.id.c2);
        c3 = (EditText) findViewById(R.id.c3);
        c4 = (EditText) findViewById(R.id.c4);
        c5 = (EditText) findViewById(R.id.c5);
        c6=(EditText)findViewById(R.id.c6) ;
        tv1 =(TextView) findViewById(R.id.tv1);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s1=Integer.parseInt(c1.getText().toString());
                int s2=Integer.parseInt(c2.getText().toString());
                int s3=Integer.parseInt(c3.getText().toString());
                int s4=Integer.parseInt(c4.getText().toString());
                int s5=Integer.parseInt(c5.getText().toString());
                int s6=Integer.parseInt(c6.getText().toString());

                per=(s1+s2+s3+s4+s5+s6)/6;
                if(per>=35.00){
                    tv1.setText("PERCENTAGE ="+per);
                }else{
                    Toast.makeText(MainActivity10.this, "FAIL", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == (R.id.item1)) {
            Intent i1 = new Intent(MainActivity10.this, MainActivity3.class);
            startActivity(i1);
        } else if (item.getItemId() == R.id.item2) {
            Intent i2 = new Intent(MainActivity10.this, MainActivity8.class);
            startActivity(i2);
        } else if (item.getItemId() == R.id.item3) {
            Intent i3 = new Intent(MainActivity10.this, MainActivity9.class);
            startActivity(i3);
        } else if (item.getItemId() == R.id.item4) {
            Intent i4 = new Intent(MainActivity10.this, MainActivity10.class);
            startActivity(i4);
        } else if (item.getItemId() == R.id.item5) {
            Intent i5 = new Intent(MainActivity10.this, MainActivity11.class);
            startActivity(i5);
        } else if (item.getItemId() == R.id.item6) {
            Intent i6 = new Intent(MainActivity10.this, MainActivity12.class);
            startActivity(i6);
        } else if (item.getItemId() == R.id.item7) {
            Intent i7 = new Intent(MainActivity10.this, MainActivity13.class);
            startActivity(i7);
        }
        return super.onOptionsItemSelected(item);
    }
}