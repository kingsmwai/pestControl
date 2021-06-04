package com.example.pestcontrolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Launcher : AppCompatActivity() {
    lateinit var REgister:Button
    lateinit var eLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
        REgister = findViewById(R.id.Reegister)
        eLogin = findViewById(R.id.eLogin)
        REgister.setOnClickListener {
            val intent = Intent(this, Regi::class.java)
            startActivity(intent)
        }
        eLogin.setOnClickListener {
            val intent = Intent(this, SQLiteDataActivity::class.java)
            startActivity(intent)
        }

    }
}