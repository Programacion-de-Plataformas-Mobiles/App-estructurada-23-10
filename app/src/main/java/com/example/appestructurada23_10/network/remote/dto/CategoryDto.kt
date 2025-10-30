package com.example.appestructurada23_10.network.remote.dto

import com.squareup.moshi.Json

data class CategoryDto(
    @Json(name="idCategory") val idCategory: String,
    @Json(name="strCategory") val strCategory: String,
    @Json(name="strCategoryThumb") val strCategoryThumb: String,
    @Json(name="strCategoryDescription") val strCategoryDescription: String
)