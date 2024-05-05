package com.heavin.nasagallery.api

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NasaResponse(
    val photos: PhotoResponse
)
