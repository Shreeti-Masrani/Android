package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class webview extends AppCompatActivity implements View.OnClickListener {

    EditText search;
    Button btn;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        search = findViewById(R.id.search);
        btn = findViewById(R.id.btn);
        wv = findViewById(R.id.wv);
        btn.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.btn:
                String url= search.getText().toString();
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setWebViewClient(new MyWebviewClient());
                wv.loadUrl(url);

                break;
        }

    }
    private class MyWebviewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
           // return super.shouldOverrideUrlLoading(view, url);
            view.loadUrl(url);
            return true;
        }
    }
}