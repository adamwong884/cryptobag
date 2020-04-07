package com.example.cryptobug;

import com.example.cryptobug.entities.Coin;
import com.example.cryptobug.entities.CoinLoreResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CoinService {

    @GET("/api/tickers")
    Call<CoinLoreResponse> getCoins();
}

