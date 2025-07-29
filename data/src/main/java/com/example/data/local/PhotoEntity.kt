package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.domain.models.Src

@Entity(tableName = "photos")
data class PhotoEntity(
    @PrimaryKey(autoGenerate = true)
    val photoId: Int = -1,
    val alt: String? = null,
    val avgColor: String? = null,
    val height: Int? = null,
    val liked: Boolean? = null,
    val photographer: String? = null,
    val photographerId: Long? = null,
    val photographerUrl: String? = null,
    val src: Src? = null,
    val url: String? = null,
    val width: Int? = null
)
