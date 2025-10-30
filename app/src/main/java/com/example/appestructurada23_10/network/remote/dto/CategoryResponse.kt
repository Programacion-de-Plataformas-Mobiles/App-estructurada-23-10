package com.example.appestructurada23_10.network.remote.dto

import com.squareup.moshi.Json

data class CategoriesResponse(@Json(name="categories") val categories: List<CategoryDto>)