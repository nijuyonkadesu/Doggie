package com.njk.doggie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.njk.doggie.data.Datasource
import com.njk.doggie.adapter.DogCardAdapter
import com.njk.doggie.const.Layout
import com.njk.doggie.databinding.ActivityGridListBinding


class GridListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGridListBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerGrid.adapter =
            DogCardAdapter(this, Datasource().loadDogs(), Layout.GRID)
    }
}