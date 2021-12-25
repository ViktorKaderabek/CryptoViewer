package com.example.cryptoviewer.data.repository

import com.example.cryptoviewer.data.remote.CoinPaprikaApi
import com.example.cryptoviewer.data.remote.dto.CoinDetailDto
import com.example.cryptoviewer.data.remote.dto.CoinDtoItem
import com.example.cryptoviewer.domain.repository.CoinRepository
import javax.inject.Inject


class CoinRepositoryImpl @Inject constructor(private val api : CoinPaprikaApi) : CoinRepository {


    override suspend fun getCoins(): List<CoinDtoItem> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}