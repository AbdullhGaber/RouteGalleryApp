package com.example.routegalleryapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.routegalleryapp.screens.home.HomeScreen
import com.example.routegalleryapp.screens.home.HomeViewModel
import com.example.routegalleryapp.screens.home.components.GalleryTopAppBar
import com.example.routegalleryapp.ui.theme.RouteGalleryAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val homeViewModel : HomeViewModel = hiltViewModel()
            RouteGalleryAppTheme(
                darkTheme = homeViewModel.isDark.value
            ){
                installSplashScreen()
                Scaffold(
                    topBar = {
                        val isChecked = remember {
                            mutableStateOf(homeViewModel.isDark.value)
                        }
                        GalleryTopAppBar(
                            onToggleClicked = {
                                isChecked.value = !isChecked.value
                                homeViewModel.toggleTheme()
                            },
                            checked = isChecked.value
                        )
                    }
                ) { innerPadding ->
                    HomeScreen(
                        modifier = Modifier.padding(innerPadding),
                        homeViewModel = homeViewModel
                    )
                }
            }
        }
    }
}


