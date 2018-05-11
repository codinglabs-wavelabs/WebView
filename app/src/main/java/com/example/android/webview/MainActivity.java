package com.example.android.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button click;
    EditText get_url;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = findViewById(R.id.web);
        get_url = findViewById(R.id.url);
        webView = findViewById(R.id.webView);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = get_url.getText().toString();
                webView.loadUrl(url);
            }
        });
    }
}