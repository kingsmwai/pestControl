package com.example.pestcontrolap

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Prevention : AppCompatActivity() {
    lateinit var prevention:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prevention)
        prevention = findViewById(R.id.precaution)
        webviewSetup()

    }
    @SuppressLint("SetJavaScriptEnabled")
    private fun webviewSetup () {
        prevention.webViewClient = WebViewClient()

        prevention.apply {
            loadUrl("https://www.forsythnews.com/life/outdoors/extension-easy-tips-preventing-pests-spring/")
                  settings.javaScriptEnabled = true
            settings.javaScriptEnabled = true
            settings.allowFileAccess = true
        }
    }

    override fun onBackPressed() {
        if (prevention.canGoBack()) prevention.goBack() else super.onBackPressed()
    }
}