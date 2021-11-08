package com.example.evaluation_4.Data.Local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Identity::class],version = 1)
abstract class IdentityDb : RoomDatabase() {
    abstract  fun getDao():DbDao
    companion object
    {
        private var INSTANCE:IdentityDb?=null
        fun getDBObject(context: Context):IdentityDb{
            if(INSTANCE==null)
            {
                val dbBuilder=Room.databaseBuilder(
                    context.applicationContext,
                    IdentityDb::class.java,
                    "IdentityDb"
                )
                dbBuilder.fallbackToDestructiveMigration()
                INSTANCE=dbBuilder.build()
                return INSTANCE!!
            }
            else
                return INSTANCE!!
        }
    }
}