package com.example.data.repositories

import com.example.data.mapper.toEntity
import com.example.domain.models.Photo
import com.example.domain.repositories.PhotosOfflineDataSource
import com.example.domain.repositories.PhotosRemoteDataSource
import com.example.domain.repositories.PhotosRepository
import com.example.domain.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PhotosRepositoryImpl @Inject constructor(
    private val mPhotoOfflineDataSource : PhotosOfflineDataSource,
    private val mPhotoRemoteDataSource : PhotosRemoteDataSource
): PhotosRepository {
    override fun getPhotos(): Flow<Resource<List<Photo>>> = flow {
        emit(Resource.Loading())

        try {
            val response = mPhotoRemoteDataSource.getPhotos()

            if(response.photos != null){
                mPhotoOfflineDataSource.addPhoto(response.photos!![0])
            }

            emit(Resource.Success(response.photos?: emptyList()))
        }catch (e : Exception){
            emit(Resource.Failure(e.message))
        }
    }
}