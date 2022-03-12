package ir.ariyana.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import ir.ariyana.instagram.databinding.ActivityMainBinding
import ir.ariyana.instagram.fragment.*

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainActivityBNV.setOnItemSelectedListener {
            when (it.itemId) {

                R.id.mainBNVHome -> {
                    startTransAction(FragmentHome())
                }

                R.id.mainBNVExplore -> {
                    startTransAction(FragmentExplore())
                }

                R.id.mainBNVNew -> {
                   startTransAction(FragmentNew())
                }

                R.id.mainBNVActivity -> {
                    startTransAction(FragmentActivity())
                }

                R.id.mainBNVProfile -> {
                    startTransAction(FragmentProfile())
                }
            }
            true
        }

        onRun()
    }

    private fun startTransAction(fragment : Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.mainActivityFrameLayout, fragment)
        transaction.commit()
    }

    private fun onRun() {
        startTransAction(FragmentHome())
        binding.mainActivityBNV.selectedItemId = R.id.mainBNVHome
    }
}