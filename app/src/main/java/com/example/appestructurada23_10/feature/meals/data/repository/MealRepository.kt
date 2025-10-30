package com.example.appestructurada23_10.feature.meals.data.repository

import com.example.appestructurada23_10.network.remote.domain.MealCategory

interface MealRepository {
    suspend fun fetchCategories(): List<MealCategory>
}