package com.example.pestcontrolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_advert.*

class Button_Nav : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var button_view:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button__nav)
        button_view=findViewById(R.id.button_view)
        button_view.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_form -> {
                val intentForm= Intent(this@Button_Nav,FormActivity::class.java)
                startActivity(intentForm)
            }
            R.id.nav_advert -> {
                val intentAdvert = Intent(this@Button_Nav,Advert::class.java)
                startActivity(intentAdvert)
            }

        }
        return true
    }
}