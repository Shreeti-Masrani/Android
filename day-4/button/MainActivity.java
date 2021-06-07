package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText n;
    TextView hn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.Submit);
        n = findViewById(R.id.name);
        hn= findViewById(R.id.hname);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm = n.getText().toString();
                hn.setText("Your name is "+nm);

                Toast.makeText(MainActivity.this,"Hello  " +nm,Toast.LENGTH_SHORT).show();
            }
        });
    }
}