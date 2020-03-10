package com.example.cryptobug;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private static final String TAG = "MyAdapter";
    private List<Coin> data;

    public void setData(ArrayList<Coin>data){
        Log.d(TAG, "setData: setting data");
        this.data = data;
        Log.d(TAG, "setData: done");


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_row, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final Coin coinAtPosition = data.get(position);

        holder.tvType.setText(coinAtPosition.getName());
        holder.tvValue.setText(String.valueOf(coinAtPosition.getValue()));
        holder.tvPercent.setText(String.valueOf(coinAtPosition.getChange1h()));
        holder.view.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("coinName", coinAtPosition.getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView tvType, tvValue, tvPercent;

        public MyViewHolder(@NonNull View v) {
            super(v);
            view = v;
            this.tvType = v.findViewById(R.id.tvType);
            this.tvValue = v.findViewById(R.id.tvValue);
            this.tvPercent = v.findViewById(R.id.tvPercent);
        }


    }


    }

