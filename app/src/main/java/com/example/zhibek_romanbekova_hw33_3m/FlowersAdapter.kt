package com.example.zhibek_romanbekova_hw33_3m

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.zhibek_romanbekova_hw33_3m.databinding.ItemFowersBinding

class FlowersAdapter(private val flowersList: ArrayList<Flowers>) :
    RecyclerView.Adapter<FlowersAdapter.FlowersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowersViewHolder {
        return FlowersViewHolder(ItemFowersBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: FlowersViewHolder, position: Int) {
        holder.bind(flowersList[position])
    }

    override fun getItemCount(): Int {
        return flowersList.size
    }

    inner class FlowersViewHolder(private val binding: ItemFowersBinding):ViewHolder(binding.root){
        fun bind(flowers: Flowers) {
            binding.listName.text = flowers.name
        }
    }
}