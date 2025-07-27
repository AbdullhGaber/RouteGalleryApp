package com.example.data.network.dto

import com.google.gson.annotations.SerializedName

data class PhotosResponseDto(
    @SerializedName("next_page")
    val nextPage: String? = null,
    val page: Int? = null,
    @SerializedName("per_page")
    val perPage: Int? = null,
    @SerializedName("photos")
    val photosDto: List<PhotoDto>? = null
)