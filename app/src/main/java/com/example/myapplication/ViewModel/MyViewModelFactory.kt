package com.example.evaluation_4.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.evaluation_4.Repository.MyRepo

class MyViewModelFactory(val repo: MyRepo) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MyViewModel(repo) as T
    }

}