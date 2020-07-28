package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity2 extends AppCompatActivity {

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient
                (new WebViewClient());
        webView.loadUrl("https://www.webdevapp.96.lt/Crypto.html");

        webView.getSettings();
    }

    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
