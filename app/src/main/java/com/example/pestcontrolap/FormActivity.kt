package com.example.pestcontrolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formactivity)
        val name = findViewById<EditText>(R.id.OccupantsName)
        val gender = findViewById<EditText>(R.id.Gender)
        val houseno = findViewById<EditText>(R.id.Houseno)
        val phone = findViewById<EditText>(R.id.Phone)
        val email = findViewById<EditText>(R.id.Email)
        val pestcontrol = findViewById<EditText>(R.id.PestControl)
        val visitdate = findViewById<EditText>(R.id.Visitdate)
        val saveBtn = findViewById<Button>(R.id.SaveBtn)

        saveBtn.setOnClickListener{
            val Name = name.text.toString()
            val Gender = gender.text.toString()
            val Houseno = houseno.text.toString()
            val Phone = phone.text.toString()
            val Email = email.text.toString()
            val PestControl = pestcontrol.text.toString()
            val Visitdate = visitdate.text.toString()

            val intent = Intent(this@FormActivity, Infor_Activity::class.java)
            intent.putExtra("OccupantsName",Name)
            intent.putExtra("Gender",Gender)
            intent.putExtra("Houseno",Houseno)
            intent.putExtra("Email",Email)
            intent.putExtra("PestControl",PestControl)
            intent.putExtra("Visitdate",Visitdate)
            intent.putExtra("Phone",Phone)
            startActivity(intent)
        }
    }
}