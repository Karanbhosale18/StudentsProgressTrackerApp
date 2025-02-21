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

public class MainActivity12 extends AppCompatActivity {
    ImageButton ib1,ib2,ib3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        ib1=(ImageButton) findViewById(R.id.ib1);
        ib2=(ImageButton) findViewById(R.id.ib2);
        ib3=(ImageButton) findViewById(R.id.ib3);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity12.this, MainActivity14.class);
                startActivity(intent);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity12.this, MainActivity15.class);
                startActivity(intent);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity12.this, MainActivity16.class);
                startActivity(intent);
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
            Intent i1 = new Intent(MainActivity12.this, MainActivity3.class);
            startActivity(i1);
        } else if (item.getItemId() == R.id.item2) {
            Intent i2 = new Intent(MainActivity12.this, MainActivity8.class);
            startActivity(i2);
        } else if (item.getItemId() == R.id.item3) {
            Intent i3 = new Intent(MainActivity12.this, MainActivity9.class);
            startActivity(i3);
        } else if (item.getItemId() == R.id.item4) {
            Intent i4 = new Intent(MainActivity12.this, MainActivity10.class);
            startActivity(i4);
        } else if (item.getItemId() == R.id.item5) {
            Intent i5 = new Intent(MainActivity12.this, MainActivity11.class);
            startActivity(i5);
        } else if (item.getItemId() == R.id.item6) {
            Intent i6 = new Intent(MainActivity12.this, MainActivity12.class);
            startActivity(i6);
        } else if (item.getItemId() == R.id.item7) {
            Intent i7 = new Intent(MainActivity12.this, MainActivity13.class);
            startActivity(i7);
        }
        return super.onOptionsItemSelected(item);
    }
}