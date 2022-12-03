package com.example.homeworkaloe.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homeworkaloe.R
import com.example.homeworkaloe.adapter.PlantAdapter
import com.example.homeworkaloe.util.Constants

class FirstFragment : Fragment() {

    private lateinit var plantAdapter: PlantAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        plantAdapter = PlantAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rv: RecyclerView = view.findViewById(R.id.rv)
        rv.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = plantAdapter
        }

        plantAdapter.submitList(Constants.plants())
        plantAdapter.onClick = { plant ->
            val bundle = bundleOf("plant" to plant)
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
        }
    }
}