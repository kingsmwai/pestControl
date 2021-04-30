package com.example.pestcontrolap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Infor_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.infor_activity)


        val intent = intent
        val Name = intent.getStringExtra("OccupantsName")
        val Gender = intent.getStringExtra("Gender")
        val Houseno = intent.getStringExtra("Houseno")
        val Phone = intent.getStringExtra("Phone")
        val Email = intent.getStringExtra("Email")
        val PestControl = intent.getStringExtra("PestControl")
        val Visitdate = intent.getStringExtra("Visitdate")
        //textview
        val resultTv = findViewById<TextView>(R.id.resultTv)
        //set text
        resultTv.text = "OccupantsName : "+ Name +"\nGender: "+ Gender+"\nHouseno : "+Houseno+ "\nPhone : "+Phone+ "\nEmail :"+Email+
                "\nPestControl: "+PestControl+ "\nVisitDate : "+Visitdate



    }
}