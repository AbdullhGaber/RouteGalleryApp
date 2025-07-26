package com.example.domain.models

data class PhotosResponse(
    val nextPage: String? = null,
    val page: Int? = null,
    val perPage: Int? = null,
    val photos: List<Photo?>? = null
)