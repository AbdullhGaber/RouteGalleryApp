package com.example.domain.use_cases

import com.example.domain.models.Photo
import com.example.domain.repositories.PhotosRepository
import com.example.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

class GetPhotosUseCase(
    private val mRepository: PhotosRepository
){
    operator fun invoke() : Flow<Resource<List<Photo>>>{
        return mRepository.getPhotos()
    }
}