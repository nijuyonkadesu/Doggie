package com.njk.doggie.data

import com.njk.doggie.R
import com.njk.doggie.model.Dog

class Datasource {
    fun loadDogs(): List<Dog>{
        return listOf<Dog>(
            Dog(R.drawable.tzeitel, R.string.d1, R.string.a1, R.string.h1),
            Dog(R.drawable.leroy, R.string.d2, R.string.a2, R.string.h2),
            Dog(R.drawable.frankie, R.string.d3, R.string.a3, R.string.h3),
            Dog(R.drawable.nox, R.string.d6, R.string.a6, R.string.h6),
            Dog(R.drawable.faye, R.string.d4, R.string.a4, R.string.h4),
            Dog(R.drawable.bella, R.string.d5, R.string.a5, R.string.h5)
        )
    }
}