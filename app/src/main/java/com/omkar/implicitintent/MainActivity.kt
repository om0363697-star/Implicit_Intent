package com.omkar.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val webButton= findViewById<CardView>(R.id.carweb)
        val cameraButton= findViewById<CardView>(R.id.cardcamera)
        val mapButton= findViewById<Button>(R.id.btn2)

        webButton.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://netmirror.global/")
            startActivity(intent)

        }
        cameraButton.setOnClickListener {
            val intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)

        }

        mapButton.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.openstreetmap.org/#map=4/21.84/82.79")

        }
    }
}