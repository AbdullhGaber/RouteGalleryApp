package com.example.routegalleryapp.screens.home

import com.example.domain.models.Photo

data class PhotoState(
    var photos : List<Photo> = emptyList(),
    var isLoading : Boolean = false,
)