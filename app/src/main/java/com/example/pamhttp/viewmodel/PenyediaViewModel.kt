package com.example.pamhttp.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pamhttp.repositori.AplikasiDataSiswa
import com.example.pamhttp.view.DetailSiswaScreen

fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa
        )
object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { EntryViewModel(aplikasiDataSiswa().container.repositoryDataSiswa) }
        initializer { HomeViewModel(aplikasiDataSiswa().container.repositoryDataSiswa) }
        initializer { DetailViewModel(this.createSavedStateHandle(),
            aplikasiDataSiswa().container.repositoryDataSiswa)}
    }
}