package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.evaluation_4.Data.Local.DbDao
import com.example.evaluation_4.Data.Local.Identity
import com.example.evaluation_4.Data.Local.IdentityDb
import com.example.evaluation_4.Recycler.MyAdapter
import com.example.evaluation_4.Repository.MyRepo
import com.example.evaluation_4.ViewModel.MyViewModel
import com.example.evaluation_4.ViewModel.MyViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var dbDao: DbDao
    lateinit var repo: MyRepo
    lateinit var viewModel: MyViewModel
    lateinit var adapter: MyAdapter
    var list= mutableListOf<Identity>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbDao=IdentityDb.getDBObject(this).getDao()
        repo= MyRepo(dbDao)
        val myViewModelFactory=MyViewModelFactory(repo)

        viewModel= MyViewModel(repo)
        viewModel.newIdentity(
            Identity(R.drawable.superman,"superman","male",
                "cali","uk","123456","12/12/12","abc@lk.com")
        )
        viewModel.getIdentity().observe(this,{
            it.forEach{
                list.add(Identity(it.photo,it.name,it.gender,it.city,it.country,it.phone,it.dob,it.email))
            }
        })
        Log.d("Log",list.size.toString())
        adapter= MyAdapter(this,list)
        recycleer.layoutManager=LinearLayoutManager(this)
        recycleer.adapter=adapter

    }
}