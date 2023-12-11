package com.herisanjaya.userklin.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServerData {

    companion object {
//        tambahkan base url
        private const val BASE_URL = ""
    }

    private fun getInstance(): RetrofitApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RetrofitApi::class.java)
        return retrofit
    }

    private fun getAllUsers() {

    }

}