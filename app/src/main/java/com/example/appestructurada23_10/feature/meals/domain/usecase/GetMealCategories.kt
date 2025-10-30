package com.example.appestructurada23_10.feature.meals.domain.usecase

class GetMealCategories(private val repo: MealRepository) {
    suspend operator fun invoke(): Result<List<MealCategory>> =
        try { Result.Ok(repo.fetchCategories()) }
        catch (t: Throwable) { Result.Err(t) }
}