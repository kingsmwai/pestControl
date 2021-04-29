package com.example.pestcontrolap

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MyList : AppCompatActivity() {
    lateinit var ListView:ListView
    @SuppressLint("QueryPermissionsNeeded")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_list)
        ListView = findViewById(R.id.Mylistdetails)

        val items:Array<String> = resources.getStringArray(R.array.PestControlSystem)
        val listAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items)

        ListView.adapter = listAdapter

        ListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            if (position==0){
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data= Uri.parse("tel:"+"0741998165")
                startActivity(dialIntent)
            }

            else if(position==1){
                val addresses = "mwaikings4@gmail.com"
                val subject = "works"
                val intent = Intent(Intent.ACTION_SENDTO)
                intent.setData(Uri.parse("mailto:")) // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, addresses)
                intent.putExtra(Intent.EXTRA_SUBJECT, subject)
                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent)
                }
                 }else if (position==4){
                val intentCustomlistView= Intent(this,CustomList::class.java)
                startActivity(intentCustomlistView)
            }
            }
        }
    }
