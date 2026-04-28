package com.github.cesarb98.cryptomonitor.service

import com.github.cesarb98.cryptomonitor.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}