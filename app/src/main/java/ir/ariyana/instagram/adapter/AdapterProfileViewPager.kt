package ir.ariyana.instagram.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ir.ariyana.instagram.fragment.FragmentProfileContact
import ir.ariyana.instagram.fragment.FragmentProfileShare

class AdapterProfileViewPager(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> {
                FragmentProfileShare()
            }

            1 -> {
                FragmentProfileContact()
            }

            else -> {
                Fragment()
            }
        }
    }
}