package com.example.cryptoviewer.domain.repository

import com.example.cryptoviewer.data.remote.dto.CoinDetailDto
import com.example.cryptoviewer.data.remote.dto.CoinDtoItem

interface CoinRepository {

    suspend fun getCoins() : List<CoinDtoItem>

    suspend fun getCoinById(coinId : String) : CoinDetailDto


}