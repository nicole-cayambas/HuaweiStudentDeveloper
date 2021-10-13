package com.example.assignment1

import androidx.annotation.DrawableRes

data class Product(val id: Long, val name: String, val description: String, val price: Double, @DrawableRes val image: Int?)
