package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calc extends AppCompatActivity {

    EditText n1,n2;
    TextView ans;
    Button A,S,M,D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);

        ans=findViewById(R.id.ans);

        A=findViewById(R.id.A);
        S=findViewById(R.id.S);
        M=findViewById(R.id.M);
        D=findViewById(R.id.D);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1,num2;
                num1 = n1.getText().toString();
                num2 = n2.getText().toString();

                int x,y,a;
                x = Integer.parseInt(num1);
                y = Integer.parseInt(num2);
                a = x + y;

                ans.setText("Addition of 2 no. is: " +a);

                // Toast.makeText(Sum.this, "Answer is: "+sum, Toast.LENGTH_SHORT).show();
            }
        });

        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1,num2;
                num1 = n1.getText().toString();
                num2 = n2.getText().toString();

                int x,y,s;
                x = Integer.parseInt(num1);
                y = Integer.parseInt(num2);
                s = x - y;

                ans.setText("Substration of 2 no. is: " +s);

                // Toast.makeText(Sum.this, "Answer is: "+sum, Toast.LENGTH_SHORT).show();
            }
        });

        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1,num2;
                num1 = n1.getText().toString();
                num2 = n2.getText().toString();

                int x,y,m;
                x = Integer.parseInt(num1);
                y = Integer.parseInt(num2);
                m = x * y;

                ans.setText("Multiplicatio of 2 no. is: " +m);

                // Toast.makeText(Sum.this, "Answer is: "+sum, Toast.LENGTH_SHORT).show();
            }
        });

        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1,num2;
                num1 = n1.getText().toString();
                num2 = n2.getText().toString();

                int x,y,d;
                x = Integer.parseInt(num1);
                y = Integer.parseInt(num2);
                d = x / y;

                ans.setText("Division of 2 no. is: " +d);

                // Toast.makeText(Sum.this, "Answer is: "+sum, Toast.LENGTH_SHORT).show();
            }
        });

    }
}