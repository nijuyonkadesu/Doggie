package com.njk.doggie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.njk.doggie.data.Datasource
import com.njk.doggie.adapter.DogCardAdapter
import com.njk.doggie.const.Layout
import com.njk.doggie.databinding.ActivityHorizontalListBinding


class HorizontalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHorizontalListBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerHorizontal.adapter =
            DogCardAdapter(this, Datasource().loadDogs(), Layout.HORIZONTAL)
        binding.recyclerHorizontal.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}