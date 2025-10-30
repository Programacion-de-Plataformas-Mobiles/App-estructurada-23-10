package com.example.appestructurada23_10.feature.meals.domain.usecase

import com.example.appestructurada23_10.feature.meals.data.repository.MealRepository
import com.example.appestructurada23_10.network.remote.domain.MealCategory
import  com.example.appestructurada23_10.core.util.Result

class GetMealCategories(private val repo: MealRepository) {
    suspend operator fun invoke(): Result<List<MealCategory>> =
        try { Result.Ok(repo.fetchCategories()) }
        catch (t: Throwable) { Result.Err(t) }
}