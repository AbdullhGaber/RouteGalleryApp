package com.example.domain.repositories

import com.example.domain.models.PhotosResponse
import com.example.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface PhotosRepository {
    fun getPhotos() : Flow<Resource<PhotosResponse>>
}

interface PhotosRemoteDataSource {
    fun getPhotos() : Flow<Resource<PhotosResponse>>
}

interface PhotosOfflineDataSource {
    fun getPhotos() : Flow<Resource<PhotosResponse>>
}