package ir.ariyana.instagram.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ir.ariyana.instagram.databinding.RecyclerConcatItemBinding

class AdapterAddStory : RecyclerView.Adapter<AdapterAddStory.ViewHolder>() {

    inner class ViewHolder(private val binding : RecyclerConcatItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(position : Int) {

            binding.homeStoryName.text = "Your story"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerConcatItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int {
        return 1
    }
}