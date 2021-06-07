package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyAdaptor extends BaseAdapter {

    int[] image;
    String[] name;
    Context context;
    LayoutInflater layoutInflater;

    public MyAdaptor(int[] image, String[] name, Context context) {
        this.image = image;
        this.name = name;
        this.context = context;
        layoutInflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=layoutInflater.inflate(R.layout.img1,null);

        ImageView img = convertView.findViewById(R.id.c);
        TextView t= convertView.findViewById(R.id.c1);

        t.setText(name[position]);
        img.setImageResource(image[position]);

        return convertView;
    }
}
