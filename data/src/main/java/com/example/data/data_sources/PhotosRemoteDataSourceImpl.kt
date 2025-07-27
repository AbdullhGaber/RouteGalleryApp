package com.example.data.data_sources

import com.example.data.mapper.toPhotoResponse
import com.example.data.network.PexelsApi
import com.example.domain.models.PhotosResponse
import com.example.domain.repositories.PhotosRemoteDataSource
import javax.inject.Inject

class PhotosRemoteDataSourceImpl @Inject constructor(
    private val mPexelsApi: PexelsApi
) : PhotosRemoteDataSource{
    override suspend fun getPhotos(): PhotosResponse {
        return mPexelsApi.getPhotos().toPhotoResponse()
    }
}