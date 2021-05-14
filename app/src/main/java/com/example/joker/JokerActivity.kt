package com.example.joker

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.ValueCallback
import android.webkit.WebView

class JokerActivity : AppCompatActivity() {
    private val FILECHOOSER_RESULTCODE = 5

    private var parmaFilePathCallback: ValueCallback<Array<Uri>>? = null
    private lateinit var webView: WebView
    private lateinit var parmaUrl: String

    private var uri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}