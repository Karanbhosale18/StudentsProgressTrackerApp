package com.example.mainproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity4 extends AppCompatActivity {
    ImageButton imagebutton1,imagebutton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        imagebutton1=(ImageButton) findViewById(R.id.imagebutton1);
        imagebutton2=(ImageButton) findViewById(R.id.imagebutton2);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
            }
        });
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent=new Intent(MainActivity4.this,MainActivity6.class);
            startActivity(intent);
            }
        });
    }
}