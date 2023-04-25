package com.assesment.testandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.assesment.testandroid.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setData()
    }


    private fun setData() {
        val list = arrayListOf<DataModel>()
        list.apply {
            add(DataModel("Order", R.drawable.order))
            add(DataModel("How it works", R.drawable.work))
            add(DataModel("About Us", R.drawable.about))
            add(DataModel("Contact Us", R.drawable.contact))
        }
        setAdapter(list)
    }

    private fun setAdapter(list: ArrayList<DataModel>) {
        binding.recycler.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = Adapter(context, list)
        }
    }
}