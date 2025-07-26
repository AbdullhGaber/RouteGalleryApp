package com.example.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [], version = 1, exportSchema = false)
@TypeConverters(PhotosConverter::class)
abstract class PhotosDB : RoomDatabase() {
    abstract val photosDao : PhotosDao
}