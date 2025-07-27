package com.example.data.network.dto

import com.google.gson.annotations.SerializedName

data class PhotoDto(
    val alt: String? = null,
    @SerializedName("avg_color")
    val avgColor: String? = null,
    val height: Int? = null,
    val id: Int? = null,
    val liked: Boolean? = null,
    val photographer: String? = null,
    @SerializedName("photographer_id")
    val photographerId: Long? = null,
    @SerializedName("photographer_url")
    val photographerUrl: String? = null,
    @SerializedName("src")
    val srcDto: SrcDto? = null,
    val url: String? = null,
    val width: Int? = null
)