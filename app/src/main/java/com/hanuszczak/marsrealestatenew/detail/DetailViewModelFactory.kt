package com.hanuszczak.marsrealestatenew.detail

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hanuszczak.marsrealestatenew.network.MarsProperty

class DetailViewModelFactory(
    private val marsProperty: MarsProperty,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(marsProperty, application) as T
        }
        throw java.lang.IllegalArgumentException("Unknown ViewModel class")
    }
}