package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sms extends AppCompatActivity {

    EditText no,m;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        no = findViewById(R.id.no);
        m = findViewById(R.id.m);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = no.getText().toString();
                String msg = no.getText().toString();

                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(n,null,msg,null,null);

                Toast.makeText(Sms.this, "Message Sent!", Toast.LENGTH_LONG).show();
            }
        });
    }
}