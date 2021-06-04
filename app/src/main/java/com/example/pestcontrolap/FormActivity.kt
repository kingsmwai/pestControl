package com.example.pestcontrolap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class FormActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    lateinit var spinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formactivity)
        spinner= findViewById(R.id.Spinner)
        val adapter = ArrayAdapter.createFromResource(
                this,
                R.array.pest,
                android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this


        val firstname = findViewById<EditText>(R.id.firstName)
        val lastName = findViewById<TextView>(R.id.lastName)
        val pest = findViewById<TextView>(R.id.Pest)
        val phone_no = findViewById<EditText>(R.id.Phone_no)
        val house_no = findViewById<EditText>(R.id.House_no)
        val visit_date = findViewById<EditText>(R.id.Visit_date)
        val email = findViewById<EditText>(R.id.Email)
        val btnsend = findViewById<Button>(R.id.btnsend)
        btnsend.setOnClickListener{
            val Name = firstname.text.toString()
            val Gender = lastName.text.toString()
            val Houseno = house_no.text.toString()
            val Phone = phone_no.text.toString()
            val Email = email.text.toString()
            val PestControl = visit_date.text.toString()


            val intent = Intent(this@FormActivity, Infor_Activity::class.java)
            intent.putExtra("firstName",Name)
            intent.putExtra("Gender",Gender)
            intent.putExtra("LastName",Name)
            intent.putExtra("Houseno",Houseno)
            intent.putExtra("Email",Email)
            intent.putExtra("PestControl",PestControl)
            intent.putExtra("Phone",Phone)
            startActivity(intent)

        }

    }



    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }

}