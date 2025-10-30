package com.example.appestructurada23_10.feature.meals.data.repository

import com.example.appestructurada23_10.network.remote.MealDbApi
import com.example.appestructurada23_10.network.remote.domain.MealCategory
import com.example.appestructurada23_10.network.remote.mapper.toDomain

class MealRepositoryImpl(
    private val api: MealDbApi
) : MealRepository {
    override suspend fun fetchCategories(): List<MealCategory> =
        api.getCategories().categories.map { it.toDomain() }
}