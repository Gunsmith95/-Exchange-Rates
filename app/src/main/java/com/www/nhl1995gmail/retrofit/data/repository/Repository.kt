package com.www.nhl1995gmail.retrofit.data.repository

import com.www.nhl1995gmail.retrofit.data.api.RetrofitInstance
import com.www.nhl1995gmail.retrofit.model.beznal.BezNal
import com.www.nhl1995gmail.retrofit.model.nal.Nalichka
import retrofit2.Response

class Repository  {

    suspend fun getNal():Response <Nalichka>{
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBezNal():Response <BezNal>{
        return RetrofitInstance.api.getBezNalMoneys()
    }
}