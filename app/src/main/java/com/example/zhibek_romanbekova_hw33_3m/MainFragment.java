package com.example.zhibek_romanbekova_hw33_3m;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView rv_flowers;
    private ArrayList<String> flowersList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_flowers = requireActivity().findViewById(R.id.rv_flowers);
        loadData();
        initAdapter();
    }
    private void loadData() {
        flowersList.add("Rose");
        flowersList.add("Lily");
        flowersList.add("Popy");
        flowersList.add("Aster");
        flowersList.add("Gladiolus");
        flowersList.add("Iris");
        flowersList.add("Sunflower");
        flowersList.add("Azalea");
        flowersList.add("Cornflower");
        flowersList.add("Hydrangea");
        flowersList.add("Camellia");
        flowersList.add("Pansy");
        flowersList.add("Marigold");
        flowersList.add("Bluebell");
    }

    private void initAdapter() {
        FlowersAdapter adapter = new FlowersAdapter(flowersList);
        rv_flowers.setAdapter(adapter);
    }
}