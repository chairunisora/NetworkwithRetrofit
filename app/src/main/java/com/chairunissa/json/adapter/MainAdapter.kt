package com.chairunissa.json.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.chairunissa.json.data.model.DetailModel
import com.chairunissa.json.data.model.GetAllCarResponseItem
import com.chairunissa.json.databinding.ItemRecyclerviewBinding
import com.chairunissa.json.ui.DetailFragment
import com.chairunissa.json.ui.HomeFragmentDirections

class MainAdapter(
    private val item: List<GetAllCarResponseItem>
) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    class MainViewHolder(val binding: ItemRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root) {
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainViewHolder(binding)
    }
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.binding.tvNama.text = item[position].name
        holder.binding.tvHarga.text = item[position].price.toString()

        holder.itemView.setOnClickListener {
            var name = item[position].name
            var price = item[position].price
            var detail = DetailModel(
                name,price
            )
            it.findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(detail))
        }
    }
    override fun getItemCount(): Int {
        return item.size
    }
}