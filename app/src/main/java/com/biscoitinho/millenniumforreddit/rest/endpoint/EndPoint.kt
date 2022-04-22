package com.biscoitinho.millenniumforreddit.rest.endpoint

import retrofit2.http.GET

interface EndPoint {
    @GET("/")
    suspend fun testEndPoint()
}