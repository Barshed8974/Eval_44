package com.example.evaluation_4.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.evaluation_4.Data.Local.Identity
import com.example.evaluation_4.Repository.MyRepo

class MyViewModel(val repo: MyRepo) : ViewModel() {
    fun getIdentity():LiveData<List<Identity>>
    {
        return repo.getIdentity()
    }
    fun newIdentity(identity: Identity)
    {
        return repo.addIdentity(identity)
    }
}