package com.example.pestcontrolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class homepage1 : AppCompatActivity() {
    val SPLASH_SCREEN = 5000
    private lateinit var top :Animation
    private lateinit var bottom :Animation
    private lateinit var imagepest:ImageView
    private lateinit var pesttext:TextView
    private lateinit var imagepest2:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage1)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_homepage1)

        val actionBar = supportActionBar
        actionBar!!.hide()

        top = AnimationUtils.loadAnimation(this,R.anim.top)
        bottom = AnimationUtils.loadAnimation(this,R.anim.bottom)

        imagepest = findViewById(R.id.imagepest)
        imagepest2 = findViewById(R.id.imgepest2)
        pesttext = findViewById(R.id.pesttext)

        imagepest.animation = top
        imagepest2.animation = bottom
        pesttext.animation = top

        Handler().postDelayed({
            val intent = Intent(this,HomePage::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN.toLong())
    }
}