package com.www.nhl1995gmail.retrofit.data.api


import com.www.nhl1995gmail.retrofit.model.beznal.BezNal
import com.www.nhl1995gmail.retrofit.model.nal.Nalichka
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET ("pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneys():Response<Nalichka>

    @GET ("pubinfo?exchange&json&coursid=11")
    suspend fun getBezNalMoneys():Response<BezNal>
}