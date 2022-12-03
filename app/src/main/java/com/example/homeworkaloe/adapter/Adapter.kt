package com.example.homeworkaloe.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.homeworkaloe.R
import com.example.homeworkaloe.databinding.ItemLayoutBinding
import com.example.homeworkaloe.model.Plant


class PlantAdapter: ListAdapter<Plant, PlantAdapter.VHolder>(DiffCallback()) {

    lateinit var onClick: (plant: Plant) -> Unit

    private class DiffCallback: DiffUtil.ItemCallback<Plant>(){
        override fun areItemsTheSame(oldItem: Plant, newItem: Plant): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Plant, newItem: Plant): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHolder {
        return VHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class VHolder(private val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(plant: Plant){
            binding.apply {
                itemName.text = plant.name
                itemDifference.text = plant.difference
                itemLocation.text = plant.location
                itemImage.setImageResource(plant.image)
            }
            binding.arrowNext.setOnClickListener {
                onClick.invoke(plant)
            }
        }
    }
}