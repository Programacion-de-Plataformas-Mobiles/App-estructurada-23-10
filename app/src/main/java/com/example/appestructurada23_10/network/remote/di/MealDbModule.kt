package com.example.appestructurada23_10.network.remote.di

import com.example.appestructurada23_10.network.remote.MealDbApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import javax.inject.Singleton
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object MealDbModule {
    @Provides
    @Singleton
    fun provideMealDbApi(retrofit: Retrofit): MealDbApi =
        retrofit.create(MealDbApi::class.java)
}