package com.example.cryptobug;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptobug.entities.Coin;
import com.example.cryptobug.entities.CoinLoreResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private boolean mTwoPane;
    private MyAdapter mAdapter;
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.detail_container) != null) {
            mTwoPane = true;
        }

        RecyclerView mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

       // CoinLoreResponse response = new Gson()
        //Crate Gson and CoinLoreResponse instances
    //    Gson gson = new Gson();
      //  CoinLoreResponse response = gson.fromJson(CoinLoreResponse.json, CoinLoreResponse.class);
       // List<Coin> coins = response.getData();
        mAdapter = new MyAdapter(this, new ArrayList<Coin>(), mTwoPane);
        mRecyclerView.setAdapter(mAdapter);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coinlore.net")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CoinService service = retrofit.create(CoinService.class);
        Call<CoinLoreResponse> coinsCall = service.getCoins();
        Log.d(TAG, "onResponse: SUCCESS 1");

        /**      Response<CoinLoreResponse> coinsResponse = null;
              try {
        //          coinsResponse = coinsCall.execute();
              } catch (IOException e) {
                  e.printStackTrace();
              }
              List<Coin> coins = coinsResponse.body().getData();**/

        //asynchronous method
        //app freezes with synchronous
        coinsCall.enqueue(new Callback<CoinLoreResponse>() {
            @Override
            public void onResponse(Call<CoinLoreResponse> call, Response<CoinLoreResponse> response) {
                Log.d(TAG, "onResponse: SUCCESS 2");
                List<Coin> coins = response.body().getData();
                mAdapter.setCoins(coins);
            }

            @Override
            public void onFailure(Call<CoinLoreResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: Failure");
            }
        });

    }
}
