package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText email, pswd;
    Button su,li;

    public static final String main_key="myPref";
    public static final String nm_key ="nmkey";
    public static final String email_key="emailkey";
    public static final String pswd_key="pswdkey";
    public static final String no_key="nokey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.email);
        pswd = findViewById(R.id.pswd);

        su = findViewById(R.id.su);
        li = findViewById(R.id.li);

        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this,SignIn.class);
                startActivity(intent);
            }
        });

        li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uemail, userps;
                uemail=email.getText().toString();
                userps = pswd.getText().toString();

                SharedPreferences preferences= getSharedPreferences(main_key,MODE_PRIVATE);
                String e = preferences.getString(email_key," ");
                String ps = preferences.getString(pswd_key," ");
                String n= preferences.getString(no_key, " ");
                String name = preferences.getString(nm_key," ");

                if(uemail.equals(e) && userps.equals(ps)){
                    Intent intent = new Intent(login.this, home.class);
                    intent.putExtra("NAME",name);
                    intent.putExtra("EMAIL",e);
                    intent.putExtra("CONT",n);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(login.this, "Invalid email/password", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
}