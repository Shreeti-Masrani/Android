package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LifeCycle extends AppCompatActivity {

    Button btn;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        btn = findViewById(R.id.btn);
        name = findViewById(R.id.name);

        btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String n=name.getText().toString();

                     /*   Intent intent = new Intent(Intent.ACTION_VIEW);  //implict
                        intent.setData(Uri.parse("https://www.google.com"));
                        startActivity(intent);*/

                      Intent intent = new Intent(LifeCycle.this, DataActivity.class);  //explict
                        intent.putExtra("NAME", n );
                        
                        startActivity(intent);
                    }
                });
    }
}