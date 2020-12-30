package com.example.dash6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        mWebView.loadUrl("https://darkpeakanalytics.shinyapps.io/lcd_query/?SK_BOCHUM");

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}