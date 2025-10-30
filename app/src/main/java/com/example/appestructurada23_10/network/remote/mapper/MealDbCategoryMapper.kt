package com.example.appestructurada23_10.network.remote.mapper

import com.example.appestructurada23_10.network.remote.domain.MealCategory
import com.example.appestructurada23_10.network.remote.dto.CategoryDto

fun CategoryDto.toDomain() = MealCategory(
    id = idCategory,
    name = strCategory,
    description = strCategoryDescription,
    thumbnailUrl = strCategoryThumb
)