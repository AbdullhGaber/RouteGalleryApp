package com.example.data.di

import com.example.data.network.PexelsApi
import com.example.data.utils.Constants.API_KEY
import com.example.data.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Singleton
    @Provides
    fun getPhotoClient() : OkHttpClient{
        return OkHttpClient.Builder()
            .addInterceptor { chain ->
                val request = chain.request().newBuilder().addHeader("Authorization", API_KEY).build()
                chain.proceed(request)
            }.build()
    }

    @Singleton
    @Provides
    fun getRetrofitHelper(client: OkHttpClient) : Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun getPexelsApi(retrofit: Retrofit) : PexelsApi {
        return retrofit.create(PexelsApi::class.java)
    }
}