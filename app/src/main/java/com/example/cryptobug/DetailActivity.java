package com.example.cryptobug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate: Detail Activity");

        Intent intent = getIntent();
        String str = intent.getStringExtra("coinName");
        System.out.println(str);

        final Coin coin = Coin.getCoinByName(str);

        name = findViewById(R.id.tvType);
        symbol = findViewById(R.id.tvTicker);
        value = findViewById(R.id.tvValue);
        change1h = findViewById(R.id.tv1ChangeResult);
        change24h = findViewById(R.id.tv24ChangeResult);
        change7d = findViewById(R.id.tv7ChangeResult);
        marketcap = findViewById(R.id.tvMarketCapResult);
        volume = findViewById(R.id.tvVolumeResult);
        search = findViewById(R.id.ivSearch);



        name.setText(coin.getName());
        symbol.setText(coin.getSymbol());
        value.setText(Double.toString(coin.getValue()));
        change1h.setText(Double.toString(coin.getChange1h()));
        change24h.setText(Double.toString(coin.getChange24h()));
        change7d.setText(Double.toString(coin.getChange7d()));
        marketcap.setText(Double.toString(coin.getMarketcap()));
        volume.setText(Double.toString(coin.getVolume()));

        int a = 10;

        String aString = Integer.toString(a);

    }
}