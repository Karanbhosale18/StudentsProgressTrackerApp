package com.example.mainproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Map;

public class MainActivity23 extends AppCompatActivity {
    ListView listn;
    DatabaseReference db;
    ArrayList ar=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        listn=(ListView) findViewById(R.id.listn);
        db= FirebaseDatabase.getInstance().getReference().child("REPORTS");
        ArrayAdapter<String> ad= new ArrayAdapter<String>(MainActivity23.this,android.R.layout.simple_list_item_1,ar);
        listn.setAdapter(ad);
        db.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                Map m=(Map)snapshot.getValue();
                String v ="DATE : "+m.get("date").toString()+"\n"+"ROLL NO : "+m.get("rollno").toString()+"\n"+"STD : "+m.get("std").toString()+"\n"+"MARKS : "+m.get("marks").toString();
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
}