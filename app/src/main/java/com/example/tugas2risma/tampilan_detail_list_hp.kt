package com.example.tugas2risma

import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class tampilan_detail_list_hp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.tampilan_detail_list_hp)

        val hp = intent.getParcelableExtra<item_hp>("hp")
        if (hp != null) {
            val imageView: ImageView = findViewById(R.id._imageDetail)
            val textViewTitle: TextView = findViewById(R.id._imageTitle)
            val textViewDesc: TextView = findViewById(R.id._imageDesc)

            imageView.setImageResource(hp.imageSource)
            textViewTitle.text = hp.imageTitle
            textViewDesc.text = hp.imageDesc
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.hp)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}