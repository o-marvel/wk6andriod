package com.marvel.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.marvel.recycler.databinding.ActivityMainBinding
import com.marvel.recycler.model.Country

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var dAdapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val countries : List<Country> = listOf(
            Country(
                R.drawable.car_front,
                "germany"
            ),
            Country(
               R.drawable.czr_meter,
               "japan"
            ),
            Country(
                R.drawable.cars_side,
            "france"
            ),
            Country(
                R.drawable.cars_side,
                "nigeria"
            ),
            Country(
                R.drawable.cars_side,
                "switzerland"
            ),
            Country(
                R.drawable.cars_side,
                "poland"
            ),
            Country(
                R.drawable.cars_side,
                "japan"
            ),
            Country(
                R.drawable.cars_side,
                "china"
            ),
        )
        dAdapter = CountryAdapter(countries)
        binding.rvRecyvler.layoutManager = LinearLayoutManager(this)
        binding.rvRecyvler.adapter = dAdapter


    }
}