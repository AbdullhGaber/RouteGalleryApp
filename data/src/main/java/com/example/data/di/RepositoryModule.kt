package com.example.data.di

import com.example.data.data_sources.PhotosOfflineDataSourceImpl
import com.example.data.data_sources.PhotosRemoteDataSourceImpl
import com.example.data.repositories.PhotosRepositoryImpl
import com.example.domain.repositories.PhotosOfflineDataSource
import com.example.domain.repositories.PhotosRemoteDataSource
import com.example.domain.repositories.PhotosRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindPhotosRepository(repoImpl : PhotosRepositoryImpl) : PhotosRepository

    @Binds
    abstract fun bindPhotosOfflineDataSource(dataSource : PhotosOfflineDataSourceImpl) : PhotosOfflineDataSource

    @Binds
    abstract fun bindPhotosRemoteDataSource(dataSource : PhotosRemoteDataSourceImpl) : PhotosRemoteDataSource
}