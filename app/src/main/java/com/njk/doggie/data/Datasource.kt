package com.njk.doggie.data

import com.njk.doggie.R
import com.njk.doggie.model.Dog

class Datasource {
    fun loadDogs(): List<Dog>{
        return listOf<Dog>(
            Dog(R.drawable.tzeitel, R.string.d1, R.string.a1, R.string.h1),
            Dog(R.drawable.leroy, R.string.d2, R.string.a2, R.string.h2),
            Dog(R.drawable.frankie, R.string.d3, R.string.a3, R.string.h3)
        )
    }
}