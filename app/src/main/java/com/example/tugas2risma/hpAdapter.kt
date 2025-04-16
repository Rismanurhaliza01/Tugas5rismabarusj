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
                val imageView : ImageView = itemView.findViewById(R.id.txta1)
                val imageTitle : TextView = itemView.findViewById(R.id.txta2)
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
        holder.imageView.setImageResource(hp.imageSource)
        holder.imageTitle.text = hp.imageTitle

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(hp)
        }
    }
}