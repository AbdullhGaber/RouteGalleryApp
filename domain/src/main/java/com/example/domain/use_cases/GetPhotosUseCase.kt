package com.example.domain.use_cases

import com.example.domain.models.PhotosResponse
import com.example.domain.repositories.PhotosRepository
import com.example.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

class GetPhotosUseCase(
    private val mRepository: PhotosRepository
){
    operator fun invoke() : Flow<Resource<PhotosResponse>> {
        return mRepository.getPhotos()
    }
}