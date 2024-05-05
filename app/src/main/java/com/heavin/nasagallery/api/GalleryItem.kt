package com.heavin.nasagallery.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GalleryItem(
    val title: String,
    val url: String,
)
