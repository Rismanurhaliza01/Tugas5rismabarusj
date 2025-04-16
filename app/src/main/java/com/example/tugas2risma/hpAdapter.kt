package com.example.tugas2risma

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class hpAdapter (private val listhp :ArrayList<item_hp>):

        RecyclerView.Adapter<hpAdapter.ImageViewHolder>(){

        var onItemClick : ((item_hp) -> Unit)? = null

            class ImageViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
                val imageView : ImageView = itemView.findViewById(R.id.image1)
                val imageTitle : TextView = itemView.findViewById(R.id.txta1)
                val imagedeskripsi : TextView = itemView.findViewById(R.id.txta2)
                val image : TextView = itemView.findViewById(R.id.txta3)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tampilan_list_hp,parent,false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
       return listhp.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val hp = listhp[position]
        holder.imageView.setImageResource(hp.gambar)
        holder.imageTitle.text = hp.nama
        holder.imagedeskripsi.text = hp.harga
        holder.image.text = hp.stock

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(hp)
        }
    }
}