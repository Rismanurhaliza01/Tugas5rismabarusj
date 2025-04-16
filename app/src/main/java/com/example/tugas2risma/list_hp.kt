package com.example.tugas2risma

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class list_hp : AppCompatActivity() {

    private lateinit var hpRecyclerView: RecyclerView
    private lateinit var hpAdapter: hpAdapter
    private lateinit var listhp : ArrayList<item_hp>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.list_hp)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recycler)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        listhp = ArrayList()
        listhp.add(
            item_hp(
                R.drawable.oppo,
                "Oppo",
                "harga: 1.500.000",
                "stock 20",
                R.drawable.oppo,
                "Oppo",
                "xdjbechfbcdhjsxnfehjcbdhfebjbfvjbvjfbfjkrnehjbrhjgfhjrbfrhbkk"
            )
        )

        hpRecyclerView = findViewById(R.id.tampilan_list_hp)
        hpRecyclerView.setHasFixedSize(true)
        hpRecyclerView.layoutManager = LinearLayoutManager(this)

        hpAdapter = hpAdapter (listhp)
        hpRecyclerView.adapter = hpAdapter
        hpAdapter.onItemClick = {
            val intent = Intent(this, tampilan_detail_list_hp::class.java)
            intent.putExtra("hp", it)
            startActivity(intent)
        }
    }
}