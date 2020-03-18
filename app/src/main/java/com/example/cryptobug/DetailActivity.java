package com.example.cryptobug;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ScrollView;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = "DetailActivity";
    private ScrollView scrollview;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate: Detail Activity");

        scrollview = findViewById(R.id.scrollView2);

        Intent intent = getIntent();
        String str = intent.getStringExtra("coinName");
        System.out.println(str);

        getIntent().getExtras().getInt(MainActivity.KEY);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragment = new Fragment();
        Log.d(TAG, "onCreate: Detail Activity1");
        getSupportFragmentManager().beginTransaction().replace(R.id.scrollView, fragment)
                .commit();

    }
}