package ir.ariyana.instagram.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import ir.ariyana.instagram.R
import ir.ariyana.instagram.adapter.AdapterDiscover
import ir.ariyana.instagram.adapter.AdapterProfileViewPager
import ir.ariyana.instagram.data.Discover
import ir.ariyana.instagram.databinding.FragmentProfileBinding

class FragmentProfile : Fragment() {

    lateinit var binding : FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)

        val viewPagerAdapter = activity?.let { AdapterProfileViewPager(it) }
        binding.fragmentProfileViewpager.adapter = viewPagerAdapter
        val mediator = TabLayoutMediator(
            binding.fragmentProfileTablayout,
            binding.fragmentProfileViewpager,
            object : TabLayoutMediator.TabConfigurationStrategy {

                override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                    when(position) {
                        0 -> {
                            tab.icon = resources.getDrawable(R.drawable.ic_baseline_grid_on_24)
                        }

                        1 -> {
                            tab.icon = resources.getDrawable(R.drawable.ic_contact)
                        }
                    }
                }
            }
        )
        mediator.attach()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val data : ArrayList<Discover> = arrayListOf(
            Discover("https://www.sony.com/image/sonyview1?fmt=png&wid=1200", "Sony"),
            Discover("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/NASA_logo.svg/1200px-NASA_logo.svg.png", "NASA"),
            Discover("https://www.spacex.com/static/images/share.jpg", "SpaceX"),
            Discover("https://cdn.britannica.com/45/223045-050-A6453D5D/Telsa-CEO-Elon-Musk-2014.jpg", "Elon Musk"),
            Discover("https://upload.wikimedia.org/wikipedia/commons/4/4e/Darren_Hardy.jpg", "Darren Hardy"),
        )

        val adapter = AdapterDiscover(data)
        binding.fragmentProfileRecyclerView.adapter = adapter
        binding.fragmentProfileRecyclerView.layoutManager = LinearLayoutManager(parentFragment?.context, RecyclerView.HORIZONTAL, false)
    }
}