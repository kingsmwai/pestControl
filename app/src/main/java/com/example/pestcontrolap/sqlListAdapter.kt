package com.example.pestcontrolap

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class sqlListAdapter(private val context: Activity, private val id: Array<String>, private val name: Array<String>, private val email: Array<String>)
    : ArrayAdapter<String>(context,R.layout.custom_list,name)
{

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_list, null,true)
        val textid:TextView = rowView.findViewById(R.id.userId )
        val textName:TextView = rowView.findViewById(R.id.userName )
        val textEmail:TextView = rowView.findViewById(R.id.userEmail )


        textid.text = "ID: ${id[position]}"
        textName.text = "Name: ${name[position]}"
        textEmail.text = "Email: ${email[position]}"

        return rowView
    }
}