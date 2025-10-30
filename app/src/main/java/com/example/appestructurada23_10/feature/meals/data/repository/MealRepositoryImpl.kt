package com.example.appestructurada23_10.feature.meals.data.repository

class MealRepositoryImpl(
    private val api: MealDbApi
) : MealRepository {
    override suspend fun fetchCategories(): List<MealCategory> =
        api.getCategories().categories.map { it.toDomain() }
}