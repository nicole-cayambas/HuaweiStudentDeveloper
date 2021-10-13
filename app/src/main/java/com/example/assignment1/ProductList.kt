package com.example.assignment1

fun ProductList(): List<Product>{
        return listOf(
            Product(
                id = 1,
                name = "Flower",
                image = R.drawable.flower,
                description = "This is a dummy description.",
                price = 19.99
            ),
            Product(
                id = 2,
                name = "Plant",
                image = R.drawable.plantpot,
                description = "This is a dummy description.",
                price = 24.99
            ),
            Product(
                id = 3,
                name = "Mushroom",
                image = R.drawable.mushroom,
                description = "This is a dummy description.",
                price = 9.99
            ),
            Product(
                id = 4,
                name = "Rainboots",
                image = R.drawable.rainboots,
                description = "This is a dummy description.",
                price = 19.99
            ),
            Product(
                id = 5,
                name = "Saw",
                image = R.drawable.saw,
                description = "This is a dummy description.",
                price = 14.99
            ),
            Product(
                id = 6,
                name = "Seeds",
                image = R.drawable.seedbag,
                description = "This is a dummy description.",
                price = 13.99
            ),
            Product(
                id = 7,
                name = "Watering Can",
                image = R.drawable.wateringcan,
                description = "This is a dummy description.",
                price = 24.99
            ),
            Product(
                id = 8,
                name = "Watering Hose",
                image = R.drawable.waterhose,
                description = "This is a dummy description.",
                price = 29.99
            ),
            Product(
                id = 9,
                name = "Bush Seeds",
                image = R.drawable.bush,
                description = "This is a dummy description.",
                price = 8.99
            )
        )
    }