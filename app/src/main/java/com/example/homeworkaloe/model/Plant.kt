package com.example.homeworkaloe.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Plant(
    val name: String,
    val location: String,
    val difference: String,
    val image: Int
): Parcelable
