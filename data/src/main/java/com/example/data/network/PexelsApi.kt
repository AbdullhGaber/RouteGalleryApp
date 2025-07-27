package com.example.data.network

import com.example.data.network.dto.PhotosResponseDto
import retrofit2.http.GET

interface PexelsApi {
    @GET("curated")
    suspend fun getPhotos() : PhotosResponseDto
}