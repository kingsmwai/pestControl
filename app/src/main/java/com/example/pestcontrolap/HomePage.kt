package com.example.pestcontrolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {
    lateinit var pic1:ImageView
    lateinit var next:Button
    lateinit var pic3:ImageView
    lateinit var text4:TextView
    lateinit var text5:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
      val  pic1=findViewById<ImageView>(R.id.pic1)
       val pic2=findViewById<ImageView>(R.id.pic2)
       val pic3=findViewById<ImageView>(R.id.pic3)
     val   next=findViewById<TextView>(R.id.next)
      val  text5=findViewById<TextView>(R.id.text5)

        pic1.setOnClickListener(
            View.OnClickListener {
            //This is how u do a toast
            Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show()

        })

        next.setOnClickListener(View.OnClickListener {
            val intentnext  = Intent(this,FormActivity::class.java)
            startActivity(intentnext)
            Log.d("check","selected" + intentnext )
        })

        text5.setOnClickListener(View.OnClickListener {
            val intentConstraint  = Intent(this,HomePage::class.java)
            startActivity(intentConstraint)
        })

    }
}