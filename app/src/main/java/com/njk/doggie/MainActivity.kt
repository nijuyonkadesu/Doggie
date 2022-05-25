package com.njk.doggie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.njk.doggie.databinding.ActivityMainBinding
const val EXTRA_MESSAGE = "com.njk.doggie.MESSAGE"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.vertical.setOnClickListener { showVertical() }
    }
    private fun showVertical(){
        val message = "trying hard"
        val intent = Intent(this, VerticalList::class.java).apply { putExtra(EXTRA_MESSAGE, message) }
        startActivity(intent)
    }
}