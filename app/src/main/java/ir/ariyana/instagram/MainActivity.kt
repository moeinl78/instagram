package ir.ariyana.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ir.ariyana.instagram.databinding.ActivityMainBinding

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
    }
}