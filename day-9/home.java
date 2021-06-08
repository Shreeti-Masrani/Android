package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class home extends AppCompatActivity {

    TextView n,e,c;
    Button lo;

    public static final String main_key="myPref";
    public static final String nm_key="nmkey";
    public static final String email_key="emailkey";
    public static final String pswd_key="pswdkey";
    public static final String no_key="nokey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        n=findViewById(R.id.n);
        e=findViewById(R.id.e);
        c=findViewById(R.id.c);
        lo=findViewById(R.id.lo);

        Intent intent = getIntent();
        String n1 = intent.getStringExtra("NAME");
        Intent intent1 = getIntent();
        String e1 = intent1.getStringExtra("EMAIL");
        String c1 = intent.getStringExtra("CONT");


        n.setText("NAME::  " +n1);
        e.setText("EMAIL::  " +e1);
        c.setText("PHONE NO::  " +c1);

        lo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);
                SharedPreferences.Editor editor=preferences.edit();
                editor.clear();
                editor.commit();
                finish();
                moveTaskToBack(true);
            }
        });
    }
}