package com.heavin.nasagallery.api

import retrofit2.http.GET

private const val API_KEY = "GmK98R8hawKIRgIHWpmX1qDoEMBdp6x3g0jfCVOP"

interface NasaApi {
    @GET(
        "planetary/apod" +
            "?api_key=$API_KEY" +
            "&count=100"
    )
//    suspend fun fetchPhotos(): NasaResponse
    suspend fun fetchPhotos(): List<GalleryItem>
}
