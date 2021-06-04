package com.example.pestcontrolap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class SQLiteDataActivity : AppCompatActivity() {
    lateinit var editEmail:EditText
    lateinit var editId:EditText
    lateinit var editName:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_q_lite_data)
    }
   fun saveData(view: View){
       val id = editId.text.toString()
       val name = editName.text.toString()
       val email = editEmail.text.toString()

       val databaseHandler = DatabaseHandler(this)

       if (id.trim() != "" && name.trim() != "" && email.trim() != ""){
           //if its not equal to null , write to my sqlite
           val status = databaseHandler.addUsers(sqlListModel(Integer.valueOf(id),name,email))
           //if data is added
           if (status > -1){
               Toast.makeText(applicationContext,"Record saved", Toast.LENGTH_LONG).show()
               //user experience , clear inputs
               editId.text?.clear()
               editName.text?.clear()
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
            //looping our records in sqlite db and save them to our variables above
            var index = 0
            for(e in viewdata){
                empArrayId[index] = e.userId.toString()
                empArrayName[index] = e.userName
                empArrayEmail[index] = e.userEmail
                index++
            }

            //create the details for our adapter
            val myadpater = sqlListAdapter(this,empArrayId,empArrayName,empArrayEmail)

        }


}

