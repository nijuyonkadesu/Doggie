package com.njk.doggie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.njk.doggie.databinding.ActivityVerticalListBinding

class VerticalList : AppCompatActivity() {
    private lateinit var binding: ActivityVerticalListBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.apply { text = intent.getStringExtra(EXTRA_MESSAGE) }
    }
}