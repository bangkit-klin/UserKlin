package com.herisanjaya.userklin.api

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServerData {

    companion object {
//        tambahkan base url
        private const val BASE_URL = "https://klin-server-backend-bhvoy6ma5a-et.a.run.app"
        private const val API_KEY = "inkubasi2023"
    }

    private fun getInstance(): RetrofitApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RetrofitApi::class.java)
        return retrofit
    }

    public fun test() {
        getAllUsers()
        getUser("u1701666978475")
    }

    private fun getAllUsers() {
        val call = getInstance().getUsers(API_KEY)
        call.enqueue(object : Callback<ArrayList<User>> {
            override fun onResponse(
                call: Call<ArrayList<User>>,
                response: Response<ArrayList<User>>
            ) {
                val listUser = response.body()
                if(listUser == null) {
                    Log.d("list_users_success", "NULL RESPOND")
                } else {
                    Log.d("list_users_success", listUser.toString())
                }
            }

            override fun onFailure(call: Call<ArrayList<User>>, t: Throwable) {
                t.message?.let { Log.d("list_users_error", it) }
            }

        })
    }

    private fun getUser(id: String) {
        val call = getInstance().getUserById(API_KEY, id)
        call.enqueue(object : Callback<User> {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                val user = response.body()
                if(user == null) {
                    Log.d("get_user_success", "NULL RESPOND")
                } else {
                    Log.d("get_user_success", user.toString())
                }
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                t?.message?.let { Log.d("get_user_failure", it) }
            }
        })
    }



}