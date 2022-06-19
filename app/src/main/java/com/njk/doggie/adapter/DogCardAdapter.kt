package com.njk.doggie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.njk.doggie.R
import com.njk.doggie.model.Dog

class DogCardAdapter(private val context: Context?, private val dataset: List<Dog>):
    RecyclerView.Adapter<DogCardAdapter.DogViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item, parent, false)
        return DogViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
    class DogViewHolder(private val view: View):RecyclerView.ViewHolder(view){

    }
}