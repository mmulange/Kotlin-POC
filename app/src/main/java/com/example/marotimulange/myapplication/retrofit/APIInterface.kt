package com.example.marotimulange.myapplication.retrofit

import com.example.marotimulange.myapplication.pojo.ContactFeeds
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers


interface APIInterface {

    @Headers("content-type:application/json")
    @GET("contacts/")
    fun getFeeds(): Call<ContactFeeds>
}