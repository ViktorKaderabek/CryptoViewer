package com.example.cryptoviewer.data.remote

import com.example.cryptoviewer.data.remote.dto.CoinDetailDto
import com.example.cryptoviewer.data.remote.dto.CoinDtoItem
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins() : List<CoinDtoItem>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId : String) : CoinDetailDto

}