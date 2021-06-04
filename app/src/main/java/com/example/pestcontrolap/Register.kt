//package com.example.pestcontrolap
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
//import android.widget.Toast
//
//class Register : AppCompatActivity() {
//    lateinit var etfull_names:EditText
//    lateinit var etemail:EditText
//    lateinit var etpasscode:EditText
//    lateinit var registerlogin:TextView
//    lateinit var btnregister:Button
//    lateinit var confirm_passcode:EditText
////    lateinit var registerlogin:EditText
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_register)
//            etemail=findViewById(R.id.etemail)
//            etpasscode=findViewById(R.id.etpasscode)
//            btnregister=findViewById(R.id.btnregister)
//            registerlogin=findViewById(R.id.registerlogin)
//            etfull_names=findViewById(R.id.etfull_names)
//            confirm_passcode=findViewById(R.id.confirm_passcode)
//    btnregister.setOnClickListener {
//        if (etfull_names.text.trim().isNotEmpty()||etemail.text.trim().isNotEmpty()||etpasscode.text.trim().isNotEmpty()
//            ||confirm_passcode.text.trim().isNotEmpty() ){
//            Toast.makeText(this,"Input provided",Toast.LENGTH_LONG).show()
//            }else{
//                Toast.makeText(this,"Input Required",Toast.LENGTH_LONG).show()
//    }
//
//    }
//    registerlogin.setOnClickListener{
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//    }
//    }
//
//
//}