package com.example.appestructurada23_10.network.remote

import com.example.appestructurada23_10.network.remote.dto.CategoriesResponse
import retrofit2.http.GET

interface MealDbApi {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
}