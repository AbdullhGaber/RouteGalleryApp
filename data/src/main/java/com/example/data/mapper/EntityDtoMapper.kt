package com.example.data.mapper

import com.example.data.local.PhotoEntity
import com.example.data.network.dto.PhotoDto
import com.example.data.network.dto.PhotosResponseDto
import com.example.data.network.dto.SrcDto
import com.example.domain.models.Photo
import com.example.domain.models.PhotosResponse
import com.example.domain.models.Src

fun PhotosResponseDto.toPhotoResponse() : PhotosResponse {
    return PhotosResponse(
        nextPage, page, perPage,photosDto?.map { it.toPhoto() }
    )
}

fun PhotoDto.toPhoto() : Photo{
    return Photo(alt, avgColor, height, id, liked, photographer, photographerId, photographerUrl, srcDto?.toSrc(), url, width)
}

fun SrcDto.toSrc() : Src {
    return Src(landscape, large, large2x, medium, original, portrait, small, tiny)
}

fun Photo.toEntity() : PhotoEntity{
    return PhotoEntity(
         alt = alt,
         avgColor = avgColor,
         height = height,
         liked = liked,
         photographer = photographer,
         photographerId = photographerId,
         photographerUrl = photographerUrl,
         src= src,
         url = url,
         width = width
    )
}

fun PhotoEntity.toPhoto() : Photo{
    return Photo(
         alt = alt,
         avgColor = avgColor,
         height = height,
         liked = liked,
         photographer = photographer,
         photographerId = photographerId,
         photographerUrl = photographerUrl,
         src= src,
         url = url,
         width = width
    )
}


