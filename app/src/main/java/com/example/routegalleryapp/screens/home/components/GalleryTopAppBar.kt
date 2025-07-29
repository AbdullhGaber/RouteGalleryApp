package com.example.routegalleryapp.screens.home.components;

import androidx.compose.foundation.Image
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.routegalleryapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GalleryTopAppBar(
    onToggleClicked : () -> Unit,
    checked : Boolean = false
){
    TopAppBar(
        title = {
            Image(
                painter = painterResource(id = R.drawable.route_logo),
                contentDescription = "Route Gallery App"
            )
        },
        actions = {
            Switch(
                checked = checked,
                onCheckedChange = {
                    onToggleClicked()
                },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color.Blue,
                    checkedTrackColor = Color.Gray,
                    uncheckedThumbColor = Color.Gray,
                    uncheckedTrackColor = Color.Black
                )
            )
        }
    )
}

@Preview
@Composable
private fun PreviewGalleryTopAppBar() {
    GalleryTopAppBar(onToggleClicked = {})
}