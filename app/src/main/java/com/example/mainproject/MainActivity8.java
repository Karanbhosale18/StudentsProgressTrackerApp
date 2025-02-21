package com.example.mainproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Map;


public class MainActivity8 extends AppCompatActivity {
    ListView listn;
    DatabaseReference db;
    ArrayList ar=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        listn=(ListView) findViewById(R.id.listn);
        db= FirebaseDatabase.getInstance().getReference().child("STUDENT ATTENDANCE");
        ArrayAdapter<String> ad= new ArrayAdapter<String>(MainActivity8.this,android.R.layout.simple_list_item_1,ar);
        listn.setAdapter(ad);
        db.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Map m=(Map)snapshot.getValue();
                String v ="NAME : "+m.get("name").toString()+"\n"+"ROLL NO : "+m.get("rollno").toString();
                ar.add(v);
                ad.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

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
            Intent i1 = new Intent(MainActivity8.this, MainActivity3.class);
            startActivity(i1);
        } else if (item.getItemId() == R.id.item2) {
            Intent i2 = new Intent(MainActivity8.this, MainActivity8.class);
            startActivity(i2);
        } else if (item.getItemId() == R.id.item3) {
            Intent i3 = new Intent(MainActivity8.this, MainActivity9.class);
            startActivity(i3);
        } else if (item.getItemId() == R.id.item4) {
            Intent i4 = new Intent(MainActivity8.this, MainActivity10.class);
            startActivity(i4);
        } else if (item.getItemId() == R.id.item5) {
            Intent i5 = new Intent(MainActivity8.this, MainActivity11.class);
            startActivity(i5);
        } else if (item.getItemId() == R.id.item6) {
            Intent i6 = new Intent(MainActivity8.this, MainActivity12.class);
            startActivity(i6);
        }else if (item.getItemId()==R.id.item7) {
            Intent i7 = new Intent(MainActivity8.this,MainActivity13.class);
            startActivity(i7);
        }
        return super.onOptionsItemSelected(item);

    }
}