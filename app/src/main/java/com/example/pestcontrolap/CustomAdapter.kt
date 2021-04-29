package com.example.pestcontrolap

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(private val context: Activity, private val title:Array<String>, private val image:Array<Int>) : ArrayAdapter<String>(context,R.layout.activity_list_item,title) {

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View  {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.activity_list_item,null,true)
        val textTitle: TextView = rowView.findViewById(R.id.textImagee)
        val images: ImageView = rowView.findViewById(R.id.imageItem)
        textTitle.text = title[position]
        images.setImageResource(image[position])



        return rowView

    }
}