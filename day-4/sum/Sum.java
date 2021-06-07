package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sum extends AppCompatActivity {

    EditText num1, num2;
    TextView ans;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        num1 = findViewById(R.id.n1);
        num2 = findViewById(R.id.n2);
        ans = findViewById(R.id.ans);
        btn = findViewById(R.id.submit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String n1,n2;
               n1 = num1.getText().toString();
               n2 = num2.getText().toString();

               int x,y,sum;
               x = Integer.parseInt(n1);
               y = Integer.parseInt(n2);

               sum = x + y;

               ans.setText("Sum of 2 no. is: " +sum);

              // Toast.makeText(Sum.this, "Answer is: "+sum, Toast.LENGTH_SHORT).show();
            }
        });

    }
}