package ir.ariyana.instagram.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.ariyana.instagram.data.Discover
import ir.ariyana.instagram.databinding.RecyclerProfileItemBinding

class AdapterDiscover(private val data : ArrayList<Discover>) : RecyclerView.Adapter<AdapterDiscover.ViewHolder>() {

    inner class ViewHolder(private val binding : RecyclerProfileItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(position : Int) {

            binding.profileRecyclerViewName.text = data[position].profileName
            Glide
                .with(binding.root.context)
                .load(data[position].profileImage)
                .into(binding.profileRecyclerViewImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerProfileItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}