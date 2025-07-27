package com.example.data.data_sources

import com.example.data.local.PhotosDB
import com.example.data.mapper.toEntity
import com.example.data.mapper.toPhoto
import com.example.domain.models.Photo
import com.example.domain.repositories.PhotosOfflineDataSource
import javax.inject.Inject

class PhotosOfflineDataSourceImpl @Inject constructor(
     mDB: PhotosDB
): PhotosOfflineDataSource {
    private val mDao = mDB.photosDao

    override suspend fun getPhotos(): List<Photo>{
        return mDao.getPhotos().map { it.toPhoto() }
    }

    override suspend fun addPhoto(photo: Photo) {
         mDao.addPhoto(photo.toEntity())
    }
}