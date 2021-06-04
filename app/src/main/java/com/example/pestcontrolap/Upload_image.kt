package com.example.pestcontrolap

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import com.example.pestcontrolap.R

class Upload_image : AppCompatActivity() {
    lateinit var imageupload:ImageView
    lateinit var uploadimage:Button
    private val pickImage = 100
    private var imageUri: Uri? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_image)
        imageupload = findViewById(R.id.imageupload)
        uploadimage = findViewById(R.id.uploadimage)

        uploadimage.setOnClickListener {
            val gallery =Intent(Intent.ACTION_PICK,MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery , pickImage)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            imageUri = data?.data
            imageupload.setImageURI(imageUri)
        }
    }
}