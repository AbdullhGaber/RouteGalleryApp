package com.example.routegalleryapp

import android.app.Application
import com.example.data.utils.SharedPreferencesUtils
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class RouteGalleryApp : Application(){
    override fun onCreate() {
        super.onCreate()
        SharedPreferencesUtils.init(this)
    }
}