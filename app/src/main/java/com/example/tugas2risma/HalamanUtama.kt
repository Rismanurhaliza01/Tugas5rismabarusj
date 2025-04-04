package com.example.tugas2risma

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas2risma.databinding.ActivityHalamanUtamaBinding

class HalamanUtama : AppCompatActivity() {
    private lateinit var binding: ActivityHalamanUtamaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_halaman_utama)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityHalamanUtamaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        

        binding.btntgs4.setOnClickListener{
            val intent = Intent(this, RecyclerActivity ::class.java)
            startActivity(intent)
        }
        binding.btsend.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,binding.etmessage.text.toString())
            intent.type="text/plain"
        }
       startActivity(Intent(Intent.createChooser(intent,"share to")))
    }

}