package com.example.domain.repositories

interface PhotosRepository {
    fun getPhotos(
        onSuccess : () -> Unit,
        onFailure : (Throwable) -> Unit
    )
}

interface PhotosRemoteDataSource {
    fun getPhotos(
        onSuccess: () -> Unit,
        onFailure: (Throwable) -> Unit
    )
}

interface PhotosOfflineDataSource {
    fun getPhotos(
        onSuccess: () -> Unit,
        onFailure: (Throwable) -> Unit
    )
}