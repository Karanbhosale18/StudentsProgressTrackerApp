package com.example.mainproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity17 extends AppCompatActivity {
ImageButton ib1,ib2,ib3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        ib1=(ImageButton) findViewById(R.id.ib1);
        ib2=(ImageButton) findViewById(R.id.ib2);
        ib3=(ImageButton)findViewById(R.id.ib3);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity17.this, MainActivity20.class);
                startActivity(intent);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity17.this, MainActivity18.class);
                startActivity(intent);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent=new Intent(MainActivity17.this, MainActivity22.class);
            startActivity(intent);
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
            Intent i1 = new Intent(MainActivity17.this, MainActivity17.class);
            startActivity(i1);
        } else if (item.getItemId() == R.id.item2) {
            Intent i2 = new Intent(MainActivity17.this, MainActivity20.class);
            startActivity(i2);
        } else if (item.getItemId() == R.id.item3) {
            Intent i3 = new Intent(MainActivity17.this, MainActivity18.class);
            startActivity(i3);
        }else if (item.getItemId() == R.id.item4) {
            Intent i3 = new Intent(MainActivity17.this, MainActivity22.class);
            startActivity(i3);
        }else if (item.getItemId() == R.id.item5) {
            Intent i3 = new Intent(MainActivity17.this, MainActivity21.class);
            startActivity(i3);
        }
        return super.onOptionsItemSelected(item);
    }
}