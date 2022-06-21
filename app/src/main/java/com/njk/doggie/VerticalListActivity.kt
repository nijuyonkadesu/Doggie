package com.njk.doggie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// import androidx.recyclerview.widget.RecyclerView
import com.njk.doggie.data.Datasource
import com.njk.doggie.adapter.DogCardAdapter
import com.njk.doggie.const.Layout
import com.njk.doggie.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerticalListBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // binding.button.apply { text = intent.getStringExtra(EXTRA_MESSAGE) }
//        val myDataset = Datasource().loadDogs()
//        val recyclerView = findViewById<RecyclerView>(R.id.recycler_vertical)
//        recyclerView.adapter = DogCardAdapter(this, myDataset)
//        recyclerView.setHasFixedSize(true)
        binding.recyclerVertical.adapter =
            DogCardAdapter(this, Datasource().loadDogs(), Layout.VERTICAL)
        binding.recyclerVertical.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}