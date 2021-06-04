package com.example.pestcontrolap

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Advert : AppCompatActivity() {
    lateinit var callbutton:Button
    lateinit var Emaill:Button
    @SuppressLint("QueryPermissionsNeeded")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advert)
        callbutton = findViewById(R.id.btncall)
        Emaill = findViewById(R.id.btnEmail)
        callbutton.setOnClickListener(View.OnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data= Uri.parse("tel:"+"0741998165")
            startActivity(dialIntent)

        })
        Emaill.setOnClickListener (View.OnClickListener {
            val addresses = "mwaikings4@gmail.com"
            val subject = "works"
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.setData(Uri.parse("mailto:"))
            intent.putExtra(Intent.EXTRA_EMAIL, addresses)
            intent.putExtra(Intent.EXTRA_SUBJECT, subject)
            if (intent.resolveActivity(getPackageManager()) != null)
            {
                startActivity(intent)
            }
        })


    }
}