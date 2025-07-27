package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.domain.models.Photo

@Dao
interface PhotosDao {
    @Query("SELECT * FROM photos")
    suspend fun getPhotos() : List<PhotoEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addPhoto(photo : PhotoEntity)
}