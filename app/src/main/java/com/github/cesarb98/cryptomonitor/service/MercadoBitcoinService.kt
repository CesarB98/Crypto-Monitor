package com.github.cesarb98.cryptomonitor.service


import com.github.cesarb98.cryptomonitor.model.TickerResponse



interface MercadoBitcoinService {


    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}