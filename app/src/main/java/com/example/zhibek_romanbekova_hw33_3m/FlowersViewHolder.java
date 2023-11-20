package com.example.zhibek_romanbekova_hw33_3m;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FlowersViewHolder extends RecyclerView.ViewHolder {
    private TextView ListName;
    public FlowersViewHolder(@NonNull View itemView) {
        super(itemView);
        ListName = itemView.findViewById(R.id.list_name);
    }
    public void bind(String name ){
        ListName.setText(name);
    }
}
