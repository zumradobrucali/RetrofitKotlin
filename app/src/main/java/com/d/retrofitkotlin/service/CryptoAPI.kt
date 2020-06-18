package com.d.retrofitkotlin.service

import com.d.retrofitkotlin.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    //1637bc71c5173eed9367a31c2cbb564e

    //https://api.nomics.com/v1/prices?key=1637bc71c5173eed9367a31c2cbb564e

    @GET("prices?key=1637bc71c5173eed9367a31c2cbb564e")
    fun getData(): Call<List<CryptoModel>>
}
