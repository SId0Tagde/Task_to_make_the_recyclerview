package com.example.lahagora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lahagora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var recyclerView : RecyclerView

     lateinit var mainModels : ArrayList<MainModel>
    lateinit var mainadapter :MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerView

        var langlogo = arrayOf<Int>(R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b,R.drawable.b)
        var langName = arrayOf<String>("Baloon","Baloon","Baloon","Baloon","Baloon","Baloon","Baloon")

        mainModels = ArrayList<MainModel>()
        for(i in langlogo){
            var model : MainModel = MainModel(langlogo[i],langName[i])
            mainModels.add(model)

        }

         var layoutManager : LinearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        recyclerView.setLayoutManager(layoutManager)
        recyclerView.setItemAnimator(DefaultItemAnimator())

        var mainadapter : MainAdapter = MainAdapter(this,mainModels)
        recyclerView.adapter = mainadapter;


    }
}