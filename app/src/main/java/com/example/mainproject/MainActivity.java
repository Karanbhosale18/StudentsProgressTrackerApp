package com.example.mainproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                } catch (Exception e) {
                    System.out.println("error=" + e);
                }
                super.run();
            }
        };
        splashThread.start();
    }
}