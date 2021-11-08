package com.example.evaluation_4.Repository

import androidx.lifecycle.LiveData
import com.example.evaluation_4.Data.Local.DbDao
import com.example.evaluation_4.Data.Local.Identity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyRepo (val dao: DbDao){
    fun addIdentity(identity: Identity){
        CoroutineScope(Dispatchers.IO).launch {
            dao.addId(identity)
        }
    }
    fun getIdentity():LiveData<List<Identity>>
    {
        return dao.Getdata()
    }
}