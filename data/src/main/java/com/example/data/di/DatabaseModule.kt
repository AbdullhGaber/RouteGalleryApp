package com.example.data.di

import android.content.Context
import androidx.room.Room
import com.example.data.local.PhotosConverter
import com.example.data.local.PhotosDB
import com.example.data.utils.Constants
import com.example.data.utils.GsonParser
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun getPhotosDB(@ApplicationContext context: Context) : PhotosDB{
        return Room.databaseBuilder(
            context = context,
            name = Constants.DB_NAME,
            klass = PhotosDB::class.java
        ).addTypeConverter(PhotosConverter(GsonParser(Gson()))).
        fallbackToDestructiveMigration(false).build()
    }
}