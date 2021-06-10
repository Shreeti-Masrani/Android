package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicPlayer extends AppCompatActivity implements View.OnClickListener {

    Button s,sp,p;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        s = findViewById(R.id.s);
        sp = findViewById(R.id.sp);
        p = findViewById(R.id.p);

        mediaPlayer = MediaPlayer.create(MusicPlayer.this, R.raw.music);

        s.setOnClickListener(this);
        sp.setOnClickListener(this);
        p.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.s:
                mediaPlayer.start();
                break;

            case R.id.sp:
                mediaPlayer.stop();
                break;

            case R.id.p:
                mediaPlayer.pause();
                break;

        }
    }
}