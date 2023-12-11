package com.herisanjaya.userklin.api

import com.google.gson.annotations.SerializedName

data class Transaction(
    @SerializedName("transaction_id")
    val id: String,

    @SerializedName("transaction_delivery")
    val delivery: String,

    @SerializedName("transaction_dateStart")
    val dateStart: String,

    @SerializedName("transaction_photoEnd")
    val photoEnd: String,

    @SerializedName("transaction_priceDiscount")
    val priceDiscount: String,

    @SerializedName("transaction_dateEnd")
    val dateEnd: String,

    @SerializedName("transaction_priceDelivery")
    val priceDelivery: String,

    @SerializedName("transaction_laundryType")
    val laundryType: String,

    @SerializedName("transaction_photoStart")
    val photoStart: String,

    @SerializedName("transaction_user")
    val user: String,

    @SerializedName("transaction_progress")
    val progress: String,

    @SerializedName("transaction_priceTotal")
    val priceTotal: String,

    @SerializedName("transaction_laundry")
    val laundry: String,

    @SerializedName("transaction_detail")
    val detail: String
)
