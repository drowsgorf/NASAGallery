package com.heavin.chapter20.api

import com.heavin.chapter20.api.FlickrResponse
import retrofit2.http.GET

private const val API_KEY = "a62369b0e276c655c92f7337f51a8c9f"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
            "&api_key=$API_KEY" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}
