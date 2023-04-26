package com.assesment.testandroid.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.assesment.testandroid.R
import com.assesment.testandroid.model.DataModel

class MainViewModel : ViewModel() {
    private val list = MutableLiveData<List<DataModel>>()

    init {
        val data = listOf(
            DataModel("Order", R.drawable.order),
            DataModel("How it works", R.drawable.work),
            DataModel("About Us", R.drawable.about),
            DataModel("Contact Us", R.drawable.contact)
        )
        list.value = data
    }

    fun getDataList(): LiveData<List<DataModel>> {
        return list
    }
}