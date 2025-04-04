package com.example.tugas2risma

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.MyAdapter

class RecyclerActivity : AppCompatActivity() {
    private lateinit var gameRecyclerView: RecyclerView
    private lateinit var gameAdapter: MyAdapter
    private lateinit var listGame : ArrayList<ItemData>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recycler)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

       gameRecyclerView = findViewById(R.id.listhp)
        listGame = ArrayList()

        listGame.add(ItemData(R.drawable.oppo,"oppo", "harga: 1.500.000", "stock 20"))
        listGame.add(ItemData(R.drawable.vivo,"vivo", "harga: 2.500.000", "stock 5"))

        gameRecyclerView.layoutManager = LinearLayoutManager(this)
        gameRecyclerView.setHasFixedSize(true)
        gameAdapter = MyAdapter(listGame)
        gameRecyclerView.adapter = gameAdapter
    }
}