package com.example.t20exchange;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AgentLogin extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_login2);

        this.setTitle("AGENT LOGIN");

        //Add back Button on tool bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        webView = findViewById(R.id.agentLoginWebView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);

        webView.setWebViewClient(new Callback());
        webView.loadUrl("http://ag.t20exchanges247.com/");
    }

    //Back button on top navbar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }
        else {
            finish();
        }
    }
}