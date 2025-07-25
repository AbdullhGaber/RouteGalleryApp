package com.example.domain.di

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
    @Singleton
    @Provides
    fun getPhotosUseCase(repository : PhotosRepository) = GetPhotosUseCase(repository)
}