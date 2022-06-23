package com.njk.doggie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.njk.doggie.R
import com.njk.doggie.const.Layout
import com.njk.doggie.model.Dog

class DogCardAdapter(
    private val context: Context?,
    private val dataset: List<Dog>,
    private val layout: Int
) :
    RecyclerView.Adapter<DogCardAdapter.DogViewHolder>() {

    class DogViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView =
            view.findViewById(R.id.dog_name) // just id's, have to populate values using onBindViewHolder
        val ageTextView: TextView = view.findViewById(R.id.dog_age)
        val hobbyTextView: TextView = view.findViewById(R.id.dog_hobby)
        val imageView: ImageView = view.findViewById(R.id.dog_pic)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {

        return if (layout == Layout.GRID) { // GRID
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.grid_list_item, parent, false)
            DogViewHolder(adapterLayout) // control goes to line 20 | pass the view of freshly created layout, cached in DogViewHolder class
        } else {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.vertical_horizontal_list_item, parent, false)
            DogViewHolder(adapterLayout) // similarly
        }
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.nameTextView.text = context?.resources?.getText(item.nameResourceId)
        //val age = context?.resources?.getText(R.string.dog_age, item.ageResourceId.toString()) - doesn't work
        holder.ageTextView.text = (context?.getString(R.string.dog_age, context.resources.getText(item.ageResourceId).toString()))
        holder.hobbyTextView.text = (context?.getString(R.string.dog_hobbies, context.resources.getText(item.hobbyResourceId).toString()))
    }

    override fun getItemCount() = dataset.size

}