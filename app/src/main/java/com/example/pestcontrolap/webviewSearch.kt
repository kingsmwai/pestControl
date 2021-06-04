package com.example.pestcontrolap

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class webviewSearch : AppCompatActivity() {
    lateinit var webview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview_search)
        webview = findViewById(R.id.Searching)

        webviewSetup()

    }
    @SuppressLint("SetJavaScriptEnabled")
    private fun webviewSetup () {
        webview.webViewClient = WebViewClient()

        webview.apply {
//            loadUrl("https://pestweb.com/")
//            loadUrl("https://www.youtube.com/watch?v=47x4efsgHiM")
            loadUrl("https://www.pestworldforkids.org/pest-guide/ants/")
            settings.javaScriptEnabled = true
            settings.javaScriptEnabled = true
            settings.allowFileAccess = true
        }
    }

    override fun onBackPressed() {
        if (webview.canGoBack()) webview.goBack() else super.onBackPressed()
    }
}