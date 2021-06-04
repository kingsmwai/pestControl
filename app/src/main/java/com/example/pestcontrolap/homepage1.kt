package com.example.pestcontrolap

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.cardview.widget.CardView

class homepage1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage1)
//        val backB: ImageButton = findViewById(R.id.backB)
//        val logOutB: ImageButton = findViewById(R.id.logOutB)
        val profileB: ImageButton = findViewById(R.id.profileB)

        // Button
        val todoB: Button = findViewById(R.id.todoB)
        val editProfileB: Button = findViewById(R.id.editProfileB)

        //  card views
        val contributeCard: CardView = findViewById(R.id.onrats)
        val practiceCard: CardView = findViewById(R.id.onbedburgs)
        val learnCard: CardView = findViewById(R.id.onants)
        val interestsCard: CardView = findViewById(R.id.ontermites)
        val helpCard: CardView = findViewById(R.id.onwoodbooer)
        val calling: ImageView = findViewById(R.id.calling)
        val emailing: ImageView = findViewById(R.id.emailing)
        val settingsCard: CardView = findViewById(R.id.onhousefly)


        // handle each of the image buttons with the OnClickListener
//        backB.setOnClickListener {
//            Toast.makeText(this, "Back Button", Toast.LENGTH_SHORT).show()
//        }
//        logOutB.setOnClickListener {
//            Toast.makeText(this, "Logout Button", Toast.LENGTH_SHORT).show()
//        }
        profileB.setOnClickListener(View.OnClickListener {
            val intentAdvert= Intent(this,HomePage::class.java)
            startActivity(intentAdvert)        })


        //  OnClickListener
        todoB.setOnClickListener(View.OnClickListener {
            val intentAdvert= Intent(this,FormActivity::class.java)
            startActivity(intentAdvert)        })
        editProfileB.setOnClickListener(View.OnClickListener {
            val intentAdvert= Intent(this,HomePage::class.java)
            startActivity(intentAdvert)        })


        //  OnClickListener
        contributeCard.setOnClickListener(View.OnClickListener  {
            val intentAdvert= Intent(this,Rats::class.java)
            startActivity(intentAdvert)
        })
        practiceCard.setOnClickListener (View.OnClickListener {
            val intentAdvert= Intent(this,Bedbugs::class.java)
            startActivity(intentAdvert)        })
        learnCard.setOnClickListener(View.OnClickListener {
            val intentAdvert= Intent(this,Ants::class.java)
            startActivity(intentAdvert)        })
        interestsCard.setOnClickListener (View.OnClickListener{
            val intentAdvert= Intent(this,Termites::class.java)
            startActivity(intentAdvert)        })
        helpCard.setOnClickListener(View.OnClickListener {
            val intentAdvert= Intent(this,Woodboorer::class.java)
            startActivity(intentAdvert)        })
        settingsCard.setOnClickListener (View.OnClickListener{
            val intentAdvert= Intent(this,Housefly::class.java)
            startActivity(intentAdvert)        })
        calling.setOnClickListener (View.OnClickListener{
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data= Uri.parse("tel:"+"0741998165")
            startActivity(dialIntent)

        })
        emailing.setOnClickListener (View.OnClickListener{
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