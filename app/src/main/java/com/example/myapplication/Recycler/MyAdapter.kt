package com.example.evaluation_4.Recycler

import android.content.Context
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.evaluation_4.Data.Local.Identity
import com.example.myapplication.R

class MyAdapter(val context: Context,val list: List<Identity>) :
    RecyclerView.Adapter<MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var view=LayoutInflater.from(context).inflate(R.layout.item,parent,false)
        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var identity=list[position]
        holder.setData(identity)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}