package com.assesment.testandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.assesment.testandroid.adapter.Adapter
import com.assesment.testandroid.databinding.ActivityMainBinding
import com.assesment.testandroid.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.layoutManager = LinearLayoutManager(this)

        viewModel.getDataList().observe(this) {
            val rAdapter = Adapter(applicationContext, it)
            binding.recycler.adapter = rAdapter
        }
    }
}
