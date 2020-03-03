package com.example.cryptobug;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity{
    private static final String TAG = "MainActivity";
    public static final String KEY = "com.example.cryptobug.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: Starting onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button launchBtn = findViewById(R.id.launchBtn);
        launchBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                launchDetailActivity("ETH");
            }

            private void launchDetailActivity(String message) {
                Intent myIntent = new Intent(MainActivity.this, DetailActivity.class);
                myIntent.putExtra(EXTRA_MESSAGE, message);
                myIntent.putExtra(KEY, message);
                startActivity(myIntent);

            }

        });
    }
}

