package com.example.data.network.dto

data class PhotosResponseDto(
    val nextPage: String? = null,
    val page: Int? = null,
    val perPage: Int? = null,
    val photosDto: List<PhotoDto?>? = null
)