package com.njk.doggie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.njk.doggie.R
import com.njk.doggie.model.Dog

class DogCardAdapter(private val context: Context?, private val dataset: List<Dog>):
    RecyclerView.Adapter<DogCardAdapter.DogViewHolder>(){

    class DogViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        val nameTextView: TextView = view.findViewById(R.id.dog_name)
        val ageTextView: TextView = view.findViewById(R.id.dog_age)
        val hobbyTextView: TextView = view.findViewById(R.id.dog_hobby)
        val imageView: ImageView = view.findViewById(R.id.dog_pic)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item, parent, false)
        return DogViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.nameTextView.text = context?.resources?.getText(item.nameResourceId)
        holder.ageTextView.text = context?.resources?.getText(item.ageResourceId)
        holder.hobbyTextView.text = context?.resources?.getText(item.hobbyResourceId)
    }
    override fun getItemCount() = dataset.size
}