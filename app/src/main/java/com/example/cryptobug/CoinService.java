package com.example.cryptobug;

import com.example.cryptobug.entities.CoinLoreResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoinService {

    @GET("/api/tickers/")
    Call<CoinLoreResponse> getCoins();
}

