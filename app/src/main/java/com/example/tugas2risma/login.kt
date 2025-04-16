package com.example.tugas2risma

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas2risma.databinding.LoginBinding

class login : AppCompatActivity() {
    private lateinit var binding: LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.hp)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.forgotpassword.setOnClickListener{
            val intent = Intent (this,LupaPassword::class.java)
            startActivity(intent)
        }
        binding.register.setOnClickListener{
            val intent = Intent (this,Register::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener{
            val intent = Intent (this, HalamanUtama::class.java)
            startActivity(intent)
        }
    }

}