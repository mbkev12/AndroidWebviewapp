package com.example.webview;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;


public class Dublinsystem extends AppCompatActivity {

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dublinsystem);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient
                (new WebViewClient());
        webView.loadUrl("https://www.webdevapp.96.lt/dub.html");

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
