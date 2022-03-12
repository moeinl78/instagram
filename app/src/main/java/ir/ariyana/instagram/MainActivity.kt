package ir.ariyana.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import ir.ariyana.instagram.databinding.ActivityMainBinding
import ir.ariyana.instagram.fragment.FragmentHome

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainActivityBNV.setOnItemSelectedListener {
            when (it.itemId) {

                R.id.mainBNVHome -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                }

                R.id.mainBNVExplore -> {
                    Toast.makeText(this, "Explore", Toast.LENGTH_SHORT).show()
                }

                R.id.mainBNVNew -> {
                    Toast.makeText(this, "New", Toast.LENGTH_SHORT).show()
                }

                R.id.mainBNVActivity -> {
                    Toast.makeText(this, "Activity", Toast.LENGTH_SHORT).show()
                }

                R.id.mainBNVProfile -> {
                    Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
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