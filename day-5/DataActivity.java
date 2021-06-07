package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView dataname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        dataname = findViewById(R.id.dataname);

        Intent intent= getIntent();
        String nm = intent.getStringExtra("NAME");

        dataname.setText("Welcome "+nm);

    }
}