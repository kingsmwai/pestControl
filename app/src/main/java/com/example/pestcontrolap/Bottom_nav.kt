package com.example.pestcontrolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class Bottom_nav : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var bottomNAv:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)
        bottomNAv=findViewById(R.id.bottomNAV)
        bottomNAv.setOnNavigationItemSelectedListener(this)
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_form -> {
                val intentForm= Intent(this@Bottom_nav,FormActivity::class.java)
                startActivity(intentForm)
            }
            R.id.nav_home -> {
                val intentHome = Intent(this@Bottom_nav,Advert::class.java)
                startActivity(intentHome)
            }
            R.id.nav_Advert -> {
                val intentAdvert = Intent(this@Bottom_nav,homepage1::class.java)
                startActivity(intentAdvert)
            }

        }
        return true
    }
}