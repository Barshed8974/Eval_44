package com.example.evaluation_4.Data.Local

import android.provider.ContactsContract
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Identity Table")
data class Identity(
    @ColumnInfo(name ="Photo" )
    var photo: Int,
    @ColumnInfo(name ="Name" )
    var name: String,
    @ColumnInfo(name ="Gender" )
    var gender: String,
    @ColumnInfo(name ="City" )
    var city: String,
    @ColumnInfo(name ="Country" )
    var country: String,
    @ColumnInfo(name ="phone" )
    var phone: String,
    @ColumnInfo(name ="Date Of Birth" )
    var dob: String,
    @ColumnInfo(name ="Email" )
    var email: String,
)
{
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    var id:Int?=null;
}
//Photo, Name, Gender, City, Country, Phone, Date of birth, Email