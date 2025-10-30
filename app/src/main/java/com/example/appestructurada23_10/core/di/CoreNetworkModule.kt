package com.example.appestructurada23_10.core.di

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton
import dagger.hilt.components.SingletonComponent

private const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"

@Module
@InstallIn(SingletonComponent::class)
object CoreNetworkModule {
    @Provides
    @Singleton
    fun okHttp() = OkHttpClient.Builder().build()
    @Provides
    @Singleton fun moshi() = Moshi.Builder().build()
    @Provides
    @Singleton
    fun retrofit(ok: OkHttpClient, moshi: Moshi): Retrofit =
        Retrofit.Builder().baseUrl(BASE_URL)
            .client(ok).addConverterFactory(MoshiConverterFactory.create(moshi)).build()
}