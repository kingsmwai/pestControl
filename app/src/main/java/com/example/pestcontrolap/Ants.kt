package com.example.pestcontrolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Ants : AppCompatActivity() {
    lateinit var more:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ants)
        more = findViewById(R.id.more)
        more.setOnClickListener(View.OnClickListener {
            val intentMore = Intent(this,webviewSearch::class.java)
            startActivity(intentMore)

        })


    }
}