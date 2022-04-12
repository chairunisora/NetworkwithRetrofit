package com.chairunissa.json.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailModel (
    val name: String,
    val price: Int
        ) : Parcelable