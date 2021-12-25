package com.example.cryptoviewer.presentation.coin_list

import com.example.cryptoviewer.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
