package ir.ariyana.instagram.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.ariyana.instagram.adapter.AdapterHome
import ir.ariyana.instagram.data.HomeItem
import ir.ariyana.instagram.databinding.FragmentHomeBinding

class FragmentHome : Fragment() {

    lateinit var binding : FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val data : ArrayList<HomeItem> = arrayListOf(
            HomeItem("Tesla", "https://media-exp1.licdn.com/dms/image/C4D0BAQHUcu98SZ2TVw/company-logo_200_200/0/1607665771371?e=2147483647&v=beta&t=U60-3BcbnYQD0zrEasbOtVpmXOoxWQly2LMNq3SQOaA", "https://cdn.motor1.com/images/mgl/zOrx0/s3/tesla-roadster.jpg", "340,000", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "924"),
            HomeItem("Apple", "https://yt3.ggpht.com/ytc/AKedOLQYJeE6Ua8hObxEs--4XTg3vLUVWy37hEn5xYlzAA=s900-c-k-c0x00ffffff-no-rj", "https://support.apple.com/content/dam/edam/applecare/images/en_US/psp/featured-section-give-back-trade-in_2x.jpg", "1,980,000", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "9,841"),
            HomeItem("Sony", "https://pbs.twimg.com/profile_images/458973611215171584/sbkfC49F_400x400.jpeg", "https://fdn.gsmarena.com/imgroot/reviews/21/sony-xperia-pro-i/preview/lifestyle/-1200w5/gsmarena_018.jpg", "340,000", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "924"),
            HomeItem("Facebook", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJE8vBPFmLcAKfgR4-l3mPZ0LRrkUfSvhG1w&usqp=CAU", "https://techcrunch.com/wp-content/uploads/2016/06/shutterstock_186292982a.jpg", "340,000", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "924"),
        )
        val adapter = AdapterHome(data)
        binding.mainActivityRecyclerView.adapter = adapter
        binding.mainActivityRecyclerView.layoutManager = LinearLayoutManager(parentFragment?.context, RecyclerView.VERTICAL, false)
    }
}