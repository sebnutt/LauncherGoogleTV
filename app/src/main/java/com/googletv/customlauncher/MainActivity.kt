package com.googletv.customlauncher

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        webView = WebView(this)
        setContentView(webView)

        val settings: WebSettings = webView.settings
        settings.javaScriptEnabled = true
        settings.domStorageEnabled = true
        settings.allowFileAccess = true

        webView.webViewClient = WebViewClient()

        // Remplacez par l'URL hébergée sur GitHub Pages de votre index.html
        webView.loadUrl("https://sebnutt.github.io/LauncherGoogleTV/index.html")
    }

    override fun onBackPressed() {
        // Désactiver le bouton retour pour rester sur le Launcher principal
    }
}
