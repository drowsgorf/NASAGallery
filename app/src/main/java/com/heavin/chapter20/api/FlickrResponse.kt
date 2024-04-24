package com.heavin.chapter20.api

import com.heavin.chapter20.api.PhotoResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FlickrResponse(
    val photos: PhotoResponse
)
