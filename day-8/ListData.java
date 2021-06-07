package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListData extends AppCompatActivity {
    ImageView I;
    TextView c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        I=findViewById(R.id.I);
        c2=findViewById(R.id.c2);

        Intent intent = getIntent();

        String name = intent.getStringExtra("n");
        c2.setText(name);

        int img = intent.getIntExtra("I1",R.drawable.c);
        I.setImageResource(img);
    }
}