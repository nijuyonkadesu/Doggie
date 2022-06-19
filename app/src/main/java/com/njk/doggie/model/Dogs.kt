package com.njk.doggie.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
// represents single Dog, later the constructor is called to create multiple dogs and attached to UI
data class Dog (
    @DrawableRes val imageResourceId: Int,
    @StringRes val nameResourceId: Int,
    @StringRes val ageResourceId : Int,
    @StringRes val hobbyResourceId : Int
    ) // @StringRes ensures the passed data is of the type specified