package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class List extends AppCompatActivity {
    ListView l;
    GridView g;

    String name[]={"PHP", "Android", "C++", "HTML", "JAVA", "C", "Python", "Kotlin"};
    String nm[]={"Demo1", "Demo2", "Demo3", "Demo4", "Demo5", "Demo6", "Demo7","Demo8", "Demo9", "Demo10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        l = findViewById(R.id.list);
        g = findViewById(R.id.grid);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(List.this, android.R.layout.simple_list_item_1,name);
        l.setAdapter(arrayAdapter);
        g.setAdapter(arrayAdapter);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(List.this, "You selected "+name[position], Toast.LENGTH_SHORT).show();
                Toast.makeText(List.this, "You selected "+nm[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}