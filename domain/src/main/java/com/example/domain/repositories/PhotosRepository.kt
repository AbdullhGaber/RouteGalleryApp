package com.example.domain.repositories

import com.example.domain.models.Photo
import com.example.domain.models.PhotosResponse
import com.example.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface PhotosRepository {
    fun getPhotos() : Flow<Resource<List<Photo>>>
}

interface PhotosRemoteDataSource {
    suspend fun getPhotos() : PhotosResponse
}

interface PhotosOfflineDataSource {
    suspend fun getPhotos() : List<Photo>
    suspend fun addPhoto(photo : Photo)
}