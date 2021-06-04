//package com.example.pestcontrolap
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.ListView
//import android.widget.Toast
//
//class CustomList : AppCompatActivity() {
//    val titles =  arrayOf(
//            "rat",
//            "Coackroaches"
//            ,"Pets",
//            "Ticks"
//            ,"flys")
//    val image:Array<Int> = arrayOf(R.drawable.pest,
//            R.drawable.pest1,
//            R.drawable.pest,
//            R.drawable.pest1,
//            R.drawable.pest1)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_bottom_nav)
//        val customAdapter = CustomAdapter(this, titles,image,)
//        val listView: ListView = findViewById(R.id.MycustomList)
//        listView.adapter = customAdapter
//
//        listView.setOnItemClickListener { parent, view, position, id ->
//
//            if (position == 0){
//                Toast.makeText(applicationContext,"item 1",Toast.LENGTH_LONG).show()
//
//            } else if(position == 1){
//                Toast.makeText(applicationContext,"item 2", Toast.LENGTH_LONG).show()
//
//            }
//        }
//    }
//}