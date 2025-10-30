package com.example.appestructurada23_10.feature.meals.domain.usecase

class SearchMealCategories {
    operator fun invoke(q: String, data: List<MealCategory>): List<MealCategory> =
        if (q.isBlank()) data else data.filter { it.name.contains(q, ignoreCase = true) }
}