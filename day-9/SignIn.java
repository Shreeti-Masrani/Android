package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {

    EditText nm,email,pswd,no;
    Button si;

    public static final String main_key="myPref";
    public static final String nm_key="nmkey";
    public static final String email_key="emailkey";
    public static final String pswd_key="pswdkey";
    public static final String no_key="nokey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        nm = findViewById(R.id.nm);
        email = findViewById(R.id.email);
        pswd = findViewById(R.id.pswd);
        no = findViewById(R.id.no);

        si = findViewById(R.id.si);

        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences(main_key, MODE_PRIVATE);
                String name, em, ps, n;
                name = nm.getText().toString();
                em = email.getText().toString();
                ps= pswd.getText().toString();
                n=no.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();
                editor.putString(nm_key,name);
                editor.putString(email_key,em);
                editor.putString(pswd_key,ps);
                editor.putString(no_key,n);

                editor.commit();

                Intent intent = new Intent(SignIn.this,login.class);
                startActivity(intent);

            }
        });
    }
}