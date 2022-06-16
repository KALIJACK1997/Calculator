package com.example.myapplication1997

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("marvel")
    fun getMarvel(): Call<List<ResultResponse>>

}