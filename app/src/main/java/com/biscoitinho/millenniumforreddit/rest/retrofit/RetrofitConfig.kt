package com.biscoitinho.millenniumforreddit.rest.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory;

class RetrofitConfig {

    private val URL = "https://www.reddit.com"
    private val OAUTH_API_URL = "https://oauth.reddit.com"

    fun getClient(): Retrofit {
        val client: OkHttpClient.Builder = OkHttpClient.Builder()
        return Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create())
            .client(client.build()).build()
    }
}