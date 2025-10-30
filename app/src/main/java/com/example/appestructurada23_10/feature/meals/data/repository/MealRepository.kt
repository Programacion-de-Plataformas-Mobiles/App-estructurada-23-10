package com.example.appestructurada23_10.feature.meals.data.repository

interface MealRepository {
    suspend fun fetchCategories(): List<MealCategory>
}