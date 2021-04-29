package com.example.pestcontrolap

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class CustomList : AppCompatActivity() {
    val titles =  arrayOf("rat","Coackroaches","Pets","Ticks")
    val image:Array<Int> = arrayOf(R.drawable.pest,R.drawable.pest1,R.drawable.pest,R.drawable.pest1,)
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list)
        val customAdapter = CustomAdapter(this, titles,image)
        val listView: ListView = findViewById(R.id.listitem)
        listView.adapter = customAdapter

        listView.setOnItemClickListener { parent, view, position, id ->

            if (position == 0){
                Toast.makeText(applicationContext,"item 1",Toast.LENGTH_LONG).show()

            } else if(position == 1){
                Toast.makeText(applicationContext,"item 2", Toast.LENGTH_LONG).show()
                if (position == 2){
                    Toast.makeText(applicationContext,"item 2",Toast.LENGTH_LONG).show()

                } else if(position == 3){
                    Toast.makeText(applicationContext,"item 3",Toast.LENGTH_LONG).show()
                }
                if (position == 4){
                    Toast.makeText(applicationContext,"item 4",Toast.LENGTH_LONG).show()

                } else if(position == 5){
                    Toast.makeText(applicationContext,"item 5",Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}