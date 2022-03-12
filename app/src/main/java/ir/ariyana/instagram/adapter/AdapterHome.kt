package ir.ariyana.instagram.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.ariyana.instagram.data.HomeItem
import ir.ariyana.instagram.databinding.RecyclerHomeItemBinding

class AdapterHome(private val data : ArrayList<HomeItem>) : RecyclerView.Adapter<AdapterHome.ViewHolder>() {

    inner class ViewHolder(private val binding : RecyclerHomeItemBinding) : RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bindData(position: Int) {

            binding.homeItemChannelName.text = data[position].channelName
            binding.homeItemChannelSecondName.text = data[position].channelName
            binding.homeItemContent.text = data[position].postContent
            binding.homeItemViewsCount.text = data[position].postViewsCount + " views"
            binding.homeItemComment.text = "View all ${data[position].postComments} comments"
            Glide
                .with(binding.root.context)
                .load(data[position].channelImage)
                .into(binding.homeItemProfileImage)

            Glide
                .with(binding.root.context)
                .load(data[position].postImage)
                .into(binding.homeItemBGImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerHomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}