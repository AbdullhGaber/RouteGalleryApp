package com.example.domain.use_cases

import com.example.domain.repositories.PhotosRepository

class GetPhotosUseCase(
    private val mRepository: PhotosRepository
){
    operator fun invoke(
        onSuccess : () -> Unit,
        onFailure : (Throwable) -> Unit
    ){
        mRepository.getPhotos(onSuccess, onFailure)
    }
}