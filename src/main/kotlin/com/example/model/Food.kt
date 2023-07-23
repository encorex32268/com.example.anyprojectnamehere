package com.example.model

import kotlinx.serialization.Serializable

const val BASE_URL =  "http://127.0.0.1:8080/"

@Serializable
data class Food(
    val name : String,
    val description : String ,
    val imagePath : String
){
    companion object{
        val foodList = listOf<Food>(
            Food(
                name = "PorkRice",
                description = "basil minced pork with rice fried egg",
                imagePath = "$BASE_URL/static/food/food1.jpg"
            ),
            Food(
                name = "BBQ Chinese Food",
                description = "bbq grill cooked with hot spicy sichuan pepper sauce is chinese herb",
                imagePath = "$BASE_URL/static/food/food2.jpg"
            ),
            Food(
                name = "French fries",
                description = "crispy french fries with ketchup mayonnaise",
                imagePath = "$BASE_URL/static/food/food3.jpg"
            ),
            Food(
                name = "Vegetable",
                description = "This is Vegetable",
                imagePath = "$BASE_URL/static/food/food4.jpg"
            ),
            Food(
                name = "Noodle",
                description = "Great noodle !!",
                imagePath = "$BASE_URL/static/food/food5.jpg"
            ),
        )

    }
}
