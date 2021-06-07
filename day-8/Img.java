package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class Img extends AppCompatActivity {

    ListView lv;
    int[] image= {R.drawable.css,R.drawable.html,R.drawable.php,R.drawable.python,R.drawable.java,R.drawable.js, R.drawable.c1,R.drawable.c};
    String[] name={"This is css","This is html","This is php","This is python","This is java","This is javaScript","This is c++","This is c"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img);

        lv=findViewById(R.id.img);

        MyAdaptor adaptor = new MyAdaptor(image, name, Img.this);
        lv.setAdapter(adaptor);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(Img.this, ListData.class);
                intent.putExtra("I1",image[position]);
                intent.putExtra("n",name[position]);
                startActivity(intent);
            }
        });

    }
}