package com.example.azkar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val context : Context, private val data : List<String>)  : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.custom_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.custom_item, parent, false)

        return ItemViewHolder(adapterLayout)

    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = data[position]
        holder.textView.text = item
    }

}