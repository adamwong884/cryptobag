package com.example.cryptobug;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;


public class DetailFragment extends Fragment {
    private static final String TAG = "DetailActivity";

    private TextView name;
    private TextView symbol;
    private TextView value;
    private TextView change1h;
    private TextView change24h;
    private TextView change7d;
    private TextView marketcap;
    private TextView volume;
    private ImageView search;
    private ViewGroup container;
    private LayoutInflater inflater;

    public DetailFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: Detail Activity");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detail, container, false);
        name = v.findViewById(R.id.tvType);
        symbol = v.findViewById(R.id.tvTicker);
        value = v.findViewById(R.id.tvValue);
        change1h = v.findViewById(R.id.tv1ChangeResult);
        change24h = v.findViewById(R.id.tv24ChangeResult);
        change7d = v.findViewById(R.id.tv7ChangeResult);
        marketcap = v.findViewById(R.id.tvMarketCapResult);
        volume = v.findViewById(R.id.tvVolumeResult);
        search = v.findViewById(R.id.ivSearch);


        final Coin coin = Coin.getCoinByName("coinName");

        name.setText(coin.getName());
        symbol.setText(coin.getSymbol());
        value.setText(Double.toString(coin.getValue()));
        change1h.setText(Double.toString(coin.getChange1h()));
        change24h.setText(Double.toString(coin.getChange24h()));
        change7d.setText(Double.toString(coin.getChange7d()));
        marketcap.setText(Double.toString(coin.getMarketcap()));
        volume.setText(Double.toString(coin.getVolume()));

        return v;


    }


}

