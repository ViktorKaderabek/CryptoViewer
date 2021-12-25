package com.example.cryptoviewer.presentation.coin_detail

import com.example.cryptoviewer.domain.model.Coin
import com.example.cryptoviewer.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
