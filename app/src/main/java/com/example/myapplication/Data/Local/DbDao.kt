package com.example.evaluation_4.Data.Local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DbDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addId(identity: Identity)
    @Query("select * from `Identity Table`")
    fun Getdata():LiveData<List<Identity>>
}