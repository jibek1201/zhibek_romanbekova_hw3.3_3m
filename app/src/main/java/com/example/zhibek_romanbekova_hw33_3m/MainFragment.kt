package com.example.zhibek_romanbekova_hw33_3m

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.zhibek_romanbekova_hw33_3m.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var flowersList = ArrayList<Flowers>()
    private val adapter = FlowersAdapter(flowersList)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        initAdapter()
    }

    private fun loadData() {
        flowersList = ArrayList()
        flowersList.add(Flowers("Rose"))
        flowersList.add(Flowers("Lily"))
        flowersList.add(Flowers("Popy"))
        flowersList.add(Flowers("Aster"))
        flowersList.add(Flowers("Gladiolus"))
        flowersList.add(Flowers("Iris"))
        flowersList.add(Flowers("Sunflower"))
        flowersList.add(Flowers("Azalea"))
        flowersList.add(Flowers("Cornflower"))
        flowersList.add(Flowers("Hydrangea"))
        flowersList.add(Flowers("Camellia"))
        flowersList.add(Flowers("Pansy"))
        flowersList.add(Flowers("Marigold"))
        flowersList.add(Flowers("Bluebell"))
    }

    private fun initAdapter() {
        binding.rvFlowers.adapter = adapter
    }
}