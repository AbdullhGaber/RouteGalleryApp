package com.example.data.network

import com.example.domain.models.PhotosResponse
import retrofit2.Call
import retrofit2.http.GET

interface PexelsApi {
    @GET("/curated")
    fun getPhotos() : List<PhotosResponse>
}