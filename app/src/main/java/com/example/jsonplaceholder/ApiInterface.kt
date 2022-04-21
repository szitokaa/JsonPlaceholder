package com.example.jsonplaceholder

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("posts") //base URL utáni endpoint
    fun getData(): Call<List<MyDataItem>>


}