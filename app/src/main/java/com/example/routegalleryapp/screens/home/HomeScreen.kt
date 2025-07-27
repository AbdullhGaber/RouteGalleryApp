package com.example.routegalleryapp.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.routegalleryapp.screens.home.components.PhotoList


@Composable
fun HomeScreen(
    modifier :Modifier = Modifier,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        if(homeViewModel.photos.value.isLoading){
            Box(Modifier.fillMaxSize()){
                CircularProgressIndicator(
                    modifier = Modifier.align(Center),
                    color = Color.Blue,
                    strokeWidth = 2.dp
                )
            }
        }else{
            PhotoList(photos = homeViewModel.photos.value.photos)
        }
    }
}



@Preview
@Composable
private fun PreviewHomeScreen() {
    HomeScreen()
}

