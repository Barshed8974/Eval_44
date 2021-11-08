package com.example.evaluation_4.Recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.evaluation_4.Data.Local.Identity
import kotlinx.android.synthetic.main.item.view.*

class MyHolder(itemview:View): RecyclerView.ViewHolder(itemview) {
    fun setData(identity: Identity)
    {
        itemView.profileIV.setImageResource(identity.photo)
        itemView.name.text=identity.name
        itemView.gender.text=identity.gender
        itemView.email.text=identity.email
        itemView.phone.text=identity.phone
        itemView.city.text=identity.city
        itemView.country.text=identity.country
        itemView.dob.text=identity.dob
    }
}