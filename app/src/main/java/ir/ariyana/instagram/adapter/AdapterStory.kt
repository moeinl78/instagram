package ir.ariyana.instagram.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.ariyana.instagram.data.Story
import ir.ariyana.instagram.databinding.RecyclerHomeStoryBinding

class AdapterStory(private val data : ArrayList<Story>) : RecyclerView.Adapter<AdapterStory.ViewHolder>() {

    inner class ViewHolder(private val binding : RecyclerHomeStoryBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(position: Int) {

            binding.homeStoryName.text = data[position].storyProfileName
            Glide
                .with(binding.root.context)
                .load(data[position].storyProfileImage)
                .into(binding.homeStoryImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerHomeStoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}