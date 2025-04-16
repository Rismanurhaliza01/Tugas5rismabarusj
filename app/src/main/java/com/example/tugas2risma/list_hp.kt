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
import com.example.tugas2risma.databinding.ListHpBinding

class list_hp : AppCompatActivity() {
    private lateinit var binding: ListHpBinding

    private lateinit var hpRecyclerView: RecyclerView
    private lateinit var hpAdapter: hpAdapter
    private lateinit var listhp : ArrayList<item_hp>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ListHpBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        listhp.add(
            item_hp(
                R.drawable.vivo,
                "oviv",
                "harga: 1.500.000",
                "stock 20",
                R.drawable.vivo,
                "Oppo",
                "12345"
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