package com.example.tugas_hadiah_modul

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TiketAdapter(private val context: Context, private val tiket: List<Tiket>, val listener: (Tiket) -> Unit)
    : RecyclerView.Adapter<TiketAdapter.TiketViewHolder>(){

    class TiketViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgtiket = view.findViewById<ImageView>(R.id.img_item_photo)
        val nametiket = view.findViewById<TextView>(R.id.tv_item_name)
        val desctiket = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(tiket: Tiket, listener: (Tiket) -> Unit) {
            imgtiket.setImageResource(tiket.imgtiket)
            nametiket.text = tiket.nameletiket
            desctiket.text = tiket.desctiket
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TiketViewHolder {
        return TiketViewHolder(
            LayoutInflater.from(context).inflate(R.layout.tiket_nonton, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TiketViewHolder, position: Int) {
        holder.bindView(tiket[position], listener)
    }

    override fun getItemCount(): Int = tiket.size

    }

