package com.njk.doggie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.njk.doggie.databinding.ActivityMainBinding
const val EXTRA_MESSAGE = "com.njk.doggie.MESSAGE" // these are keys used by the intents - good to use package name, incase if app interacts with other app there won't be any conflict
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vertical.setOnClickListener { showVertical() }
        binding.horizontal.setOnClickListener{ showHorizontal() }
        binding.grid.setOnClickListener { showGrid() }

    }
    private fun showVertical(){
        //val message = "trying hard" // * if you want to send a message through intents *
        //val intent = Intent(this, VerticalList::class.java).apply { putExtra(EXTRA_MESSAGE, message) } // intent takes key - value pairs; message is sent to EditText field
        listIntent = Intent(this, VerticalListActivity::class.java)
        startActivity(listIntent)
    }
    private fun showHorizontal(){
        listIntent = Intent(this, HorizontalListActivity::class.java)
        startActivity(listIntent)
    }
    private fun showGrid(){
        listIntent = Intent(this, GridListActivity::class.java)
        startActivity(listIntent)
    }
}