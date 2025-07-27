package com.example.routegalleryapp.screens.home.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.CachePolicy
import coil3.request.ImageRequest
import coil3.request.crossfade
import coil3.request.error
import coil3.request.placeholder
import coil3.request.transformations
import coil3.transform.CircleCropTransformation
import com.example.domain.models.Photo
import com.example.routegalleryapp.R

@Composable
fun PhotoCard(
    modifier: Modifier = Modifier,
    photo: Photo,
) {
    val context = LocalContext.current

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(context)
                .data(photo.src?.original)
                .crossfade(500)
                .diskCachePolicy(CachePolicy.ENABLED)
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .build(),
            contentDescription = photo.alt
        )
    }
}
