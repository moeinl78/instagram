package ir.ariyana.instagram.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.ariyana.instagram.data.Explore
import ir.ariyana.instagram.databinding.RecyclerExploreItemBinding

class AdapterExplore(private val data : ArrayList<Explore>) : RecyclerView.Adapter<AdapterExplore.ViewHolder>() {

    inner class ViewHolder(private val binding : RecyclerExploreItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(position: Int) {

            Glide
                .with(binding.root.context)
                .load(data[position].imageURL)
                .into(binding.itemExplorePostImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerExploreItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}