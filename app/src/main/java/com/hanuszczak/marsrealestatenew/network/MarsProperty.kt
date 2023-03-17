package com.hanuszczak.marsrealestatenew.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
class MarsProperty(
    val id: String,
    @Json(name = "img_src")
    val imgSrcUrl: String,
    val type: String,
    val price: Double
) : Parcelable {
    val isRental
        get() = type == "rent"
}