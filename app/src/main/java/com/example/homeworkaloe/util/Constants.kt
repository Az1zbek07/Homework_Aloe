package com.example.homeworkaloe.util

import com.example.homeworkaloe.R
import com.example.homeworkaloe.model.Plant

object Constants {
    fun plants(): MutableList<Plant>{
        return mutableListOf(
            Plant("Diego", "Euphorbia Eritrea", "Healthy", R.drawable.diego),
            Plant("Cassy", "Strelitzia Nicolai", "Warning", R.drawable.cassy),
            Plant("Luna", "Aloe Vera", "Healthy", R.drawable.aloe_vera),
            Plant("Diego", "Euphorbia Eritrea", "Healthy", R.drawable.diego),
            Plant("Cassy", "Strelitzia Nicolai", "Warning", R.drawable.cassy),
            Plant("Luna", "Aloe Vera", "Healthy", R.drawable.aloe_vera)
        )
    }
}