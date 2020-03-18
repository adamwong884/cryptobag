package com.example.cryptobug;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity{
    private RecyclerView recyclerView;
    private ViewGroup container;
    private androidx.fragment.app.FragmentTransaction FragmentTransaction;
    private FragmentManager FragmentManager;
    private static final String TAG = "MainActivity";
    public static final String KEY = "com.example.cryptobug.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: Starting onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager = getSupportFragmentManager();
        FragmentTransaction = FragmentManager.beginTransaction();
        FragmentTransaction.replace(R.id.fragDetail, new DetailFragment());
        FragmentTransaction.commit();
        Log.d(TAG, "fragment manager, starting transacton");


        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter myAdapter = new MyAdapter();
        myAdapter.setData(Coin.getCoins());
        recyclerView.setAdapter(myAdapter);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                startActivity(intent);
            }
        });


    }

}


