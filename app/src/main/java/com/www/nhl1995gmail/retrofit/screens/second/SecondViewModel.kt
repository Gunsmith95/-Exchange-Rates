package com.www.nhl1995gmail.retrofit.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.www.nhl1995gmail.retrofit.data.repository.Repository
import com.www.nhl1995gmail.retrofit.model.beznal.BezNal
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {
    var repo = Repository()
    val myMoneyList : MutableLiveData<Response<BezNal>> = MutableLiveData()

    fun getBezNal(){
        viewModelScope.launch {
            myMoneyList.value = repo.getBezNal()
        }
    }

}