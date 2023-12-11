package com.herisanjaya.userklin.api

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("users_email")
    val email: String,

    @SerializedName("users_role")
    val role: String,

    @SerializedName("users_id")
    val id: String,

    @SerializedName("firebase_uid")
    val firebaseUid: String,

    @SerializedName("users_picture")
    val picture: String,

    @SerializedName("users_name")
    val name: String,

    @SerializedName("users_phone")
    val phone: String
)
