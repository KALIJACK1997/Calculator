package com.example.myapplication1997

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    var serverUrl="https://simplifiedcoding.net/demos/"

    val retrofitClient: Retrofit.Builder by lazy {
        Retrofit.Builder().baseUrl(serverUrl).addConverterFactory(GsonConverterFactory.create())
    }

    val apiInterface:ApiInterface by lazy{
        retrofitClient.build().create(ApiInterface::class.java)
    }
}