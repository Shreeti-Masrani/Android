package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoPlayer extends AppCompatActivity {

    VideoView vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        vp = findViewById(R.id.vp);

        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(vp);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video );

        vp.setMediaController(mediaController);

        vp.setVideoURI(uri);

        vp.requestFocus();
        vp.start();

        vp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(VideoPlayer.this, "Thank you!!", Toast.LENGTH_SHORT).show();
            }
        });

        vp.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(VideoPlayer.this, "ERROR!", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}