package com.example.marotimulange.myapplication.retrofit

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit


class APIClient {

    companion object {

        private var retrofit: Retrofit? = null

        fun getClient(): Retrofit {

            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl("https://api.androidhive.info/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }
    }
}