package com.example.retrofittest1.model

import retrofit2.Response
import retrofit2.http.GET

interface QuotesAPI {
    @GET("quotes") // Replace "quotes" with the actual endpoint path
    suspend fun getQuote(): Response<QuoteList>
}

