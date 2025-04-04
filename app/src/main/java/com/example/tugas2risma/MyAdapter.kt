package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2risma.ItemData
import com.example.tugas2risma.R


class MyAdapter (private val namaList: ArrayList<ItemData>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder (itemData: View) : RecyclerView.ViewHolder (itemData) {
        val gambar :ImageView = itemData.findViewById(R.id.image1)
        val nama : TextView = itemData.findViewById(R.id.txta1)
        val harga : TextView = itemData.findViewById(R.id.txta2)
        val stock : TextView = itemData.findViewById(R.id.txta3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = namaList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = namaList[position]
        holder.nama.text = item.nama
        holder.harga.text = item.harga
        holder.stock.text = item.stock
        holder.gambar.setImageResource(item.gambar)
    }

}