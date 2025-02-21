package com.example.mainproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == (R.id.item1)) {
            Intent i1 = new Intent(MainActivity16.this, MainActivity14.class);
            startActivity(i1);
        } else if (item.getItemId() == R.id.item2) {
            Intent i2 = new Intent(MainActivity16.this, MainActivity15.class);
            startActivity(i2);
        } else if (item.getItemId() == R.id.item3) {
            Intent i3 = new Intent(MainActivity16.this, MainActivity16.class);
            startActivity(i3);
        }
        return super.onOptionsItemSelected(item);
    }
}