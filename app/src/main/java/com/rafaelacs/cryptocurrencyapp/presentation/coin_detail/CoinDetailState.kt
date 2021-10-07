package com.rafaelacs.cryptocurrencyapp.presentation.coin_detail

import com.rafaelacs.cryptocurrencyapp.domain.model.Coin
import com.rafaelacs.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)