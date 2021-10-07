package com.rafaelacs.cryptocurrencyapp.domain.repository

import com.rafaelacs.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.rafaelacs.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}