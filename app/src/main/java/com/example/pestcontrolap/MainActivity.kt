package com.example.pestcontrolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var buttonLog:Button
    private lateinit var etUsernames:EditText
   private lateinit var edpassword:EditText
   private lateinit var etRegister:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonLog = findViewById(R.id.buttonLog)
        edpassword= findViewById(R.id.edpassword)
        etUsernames =findViewById(R.id.etUsernames)
        etRegister =findViewById(R.id.etRegister)
        buttonLog.setOnClickListener {
            if (etUsernames.text.trim().isNotEmpty()|| edpassword.text.trim().isNotEmpty()){
                Toast.makeText(this, "input provided", Toast.LENGTH_LONG).show()

            }else{
            Toast.makeText(this,"Input ", Toast.LENGTH_LONG).show()


        }
    }
        etRegister.setOnClickListener{
            val intent = Intent(this, homepage1::class.java)
            startActivity(intent)
        }

    }
}