package com.example.data.di

import com.example.domain.repositories.PhotosRepository
import com.example.domain.use_cases.GetPhotosUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Singleton


@Module
@InstallIn(ViewModelComponent::class)
object UseCasesModule {
    @Provides
    fun getPhotosUseCase(repository : PhotosRepository) = GetPhotosUseCase(repository)
}