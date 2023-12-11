package com.herisanjaya.userklin.api

import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path

interface RetrofitApi {
    @GET
    fun getAll(@Header("X-API-Key") apiKey: String): Call<ResponseBody>

    @DELETE
    fun deleteAll(@Header("X-API-Key") apiKey: String): Call<ResponseBody>

    @GET("users")
    fun getUsers(@Header("X-API-Key") apiKey: String): Call<ArrayList<User>>

    @GET("users/{id}")
    fun getUserById(@Header("X-API-Key") apiKey: String, @Path("id") idUser: String): Call<User>

    @POST("users")
    @Multipart
    fun createUser(
        @Header("X-API-Key") apiKey: String,
        @Part("users_name") userName: RequestBody,
        @Part("users_email") userEmail: RequestBody,
        @Part("users_password") userPassword: RequestBody,
        @Part("users_phone") userPhone: RequestBody,
        @Part("users_role") userRole: RequestBody,
        @Part userPicture: MultipartBody.Part
    ): Call<ResponseBody>

    @PUT("users/{id}")
    @Multipart
    fun updateUser(
        @Header("X-API-Key") apiKey: String,
        @Path("id") idUser: String,
        @Part("users_name") userName: RequestBody,
        @Part("users_email") userEmail: RequestBody,
        @Part("users_phone") userPhone: RequestBody,
        @Part("users_role") userRole: RequestBody,
        @Part userPicture: MultipartBody.Part
    ): Call<ResponseBody>

    @DELETE("users/{id}")
    fun deleteUser(@Header("X-API-Key") apiKey: String, @Path("id") idUser: String): Call<String>

    @GET("laundry")
    fun getLaundries(@Header("X-API-Key") apiKey: String): Call<ResponseBody>

    @POST("predict")
    @Multipart
    fun predictImage(@Header("X-API-Key") apiKey: String, @Part image: MultipartBody.Part): Call<ResponseBody>

    @POST("signup")
    @Headers("Content-Type: application/json")
    fun signUp(@Header("x-api-key") apiKey: String, @Body body: RequestBody): Call<ResponseBody>

//    Belum seluruh endpoint memiliki fungsi
}