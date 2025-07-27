package com.example.routegalleryapp.screens.home

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.use_cases.GetPhotosUseCase
import com.example.domain.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val mGetPhotosUseCase: GetPhotosUseCase
) : ViewModel() {
    private val _photos = mutableStateOf(PhotoState())
    val photos : State<PhotoState> = _photos

    init {
        getPhotos()
    }

    private fun getPhotos(){
        viewModelScope.launch {
            mGetPhotosUseCase().collect{ result ->
                when(result){
                    is Resource.Unspecified -> Unit

                    is Resource.Loading -> {
                        _photos.value = _photos.value.copy(isLoading = true)
                    }

                    is Resource.Failure -> {
                        _photos.value = _photos.value.copy(isLoading = false)
                        Log.d("TAG", "getPhotos: ${result.message}")
                    }

                    is Resource.Success -> {
                        _photos.value = _photos.value.copy(
                            isLoading = false,
                            photos = result.data ?: emptyList()
                        )
                    }
                }
            }
        }
    }
}