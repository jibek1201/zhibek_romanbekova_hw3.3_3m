package com.example.zhibek_romanbekova_hw33_3m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FlowersAdapter extends RecyclerView.Adapter<FlowersViewHolder>{
    private ArrayList<String> flowersList;
    public FlowersAdapter(ArrayList<String> mealList) {
        this.flowersList = mealList;

    }
    @NonNull
    @Override
    public FlowersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FlowersViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fowers,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FlowersViewHolder holder, int position) {
        holder.bind(flowersList.get(position));

    }

    @Override
    public int getItemCount() {
        return flowersList.size() ;
    }
}