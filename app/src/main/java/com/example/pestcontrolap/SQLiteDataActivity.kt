package com.example.pestcontrolap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SQLiteDataActivity : AppCompatActivity() {
    lateinit var editEmail:EditText
    lateinit var editId:EditText
    lateinit var editName:EditText
    lateinit var firstName:EditText
    lateinit var lastName:EditText
    lateinit var Phone_no:EditText
    lateinit var Visit_date:EditText
    lateinit var Email:EditText
    lateinit var House_no:Button
    lateinit var btnSave:Button
    lateinit var btnView: Button
    lateinit var btnEdit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_q_lite_data)
    }
   fun saveData(view: View){
       val id = editId.text.toString()
       val name = editName.text.toString()
       val email = editEmail.text.toString()
       val firstName = firstName.text.toString()
       val lastName = lastName.text.toString()
       val Phone_no = Phone_no.text.toString()
       val Visit_date = Visit_date.text.toString()
       val House_no = House_no.text.toString()
       val Email = Email.text.toString()

       val databaseHandler = DatabaseHandler(this)

       if (id.trim() != ""
               && name.trim() != ""
               && email.trim() != ""
               && lastName.trim() != ""
               && Phone_no.trim() != ""
               && Visit_date.trim() != ""
               && Email.trim() != ""
               && House_no.trim() !=""
               &&lastName.trim() !=""){
           //if its not equal to null , write to my sqlite
           val status = databaseHandler.addUsers(sqlListModel(Integer.valueOf(id),name,email,Email,
                   lastName,firstName,Integer.valueOf(Visit_date),Integer.valueOf(House_no),Integer.valueOf(Phone_no)))
           //if data is added
           if (status > -1){
               Toast.makeText(applicationContext,"Record saved", Toast.LENGTH_LONG).show()
               //user experience , clear inputs
               editId.text?.clear()
               editName.text?.clear()
               editEmail.text?.clear()
               editEmail.text?.clear()
               editEmail.text?.clear()
           }

       } else {
           //if its null, notify the user
           Toast.makeText(applicationContext,"fields cannot be empty", Toast.LENGTH_LONG).show()
       }

   }
        fun viewData(View:View){
            val databaseHandler = DatabaseHandler(this)
            val viewdata: List<sqlListModel> = databaseHandler.readData()
            val empArrayId = Array<String>(viewdata.size){"0"}
            val empArrayName = Array<String>(viewdata.size){"null"}
            val empArrayEmail = Array<String>(viewdata.size){"null"}
            val empArrayPhone_no = Array<String>(viewdata.size){"0"}
            val empArrayHouse_no = Array<String>(viewdata.size){"0"}
            val empArrayVisit_date = Array<String>(viewdata.size){"0"}
            val empArraylastName = Array<String>(viewdata.size){"null"}
            val empArrayfirstName = Array<String>(viewdata.size){"null"}
            //looping our records in sqlite db and save them to our variables above
            var index = 0
            for(e in viewdata){
                empArrayId[index] = e.userId.toString()
                empArrayName[index] = e.userName
                empArrayEmail[index] = e.userEmail
                empArrayHouse_no[index] = e.House_no.toString()
                empArrayPhone_no[index] = e.Phone_no.toString()
                empArrayVisit_date[index] = e.Visit_date.toString()
                empArrayfirstName[index] = e.firstName
                empArraylastName[index] = e.userEmail
                index++
            }

            //create the details for our adapter
            val sqlListAdapter = sqlListAdapter(this,empArrayId,empArrayName,empArrayEmail)


        }


}

