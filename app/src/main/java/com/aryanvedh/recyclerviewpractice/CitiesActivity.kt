package com.aryanvedh.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CitiesActivity : AppCompatActivity() {

    private val citiesArray = listOf<MultiData>(
        MultiData(1, "New York", "Biggest City in America", 0.0),
        MultiData(2, "London", "British Capital", 0.0),
        MultiData(3, "Dublin", "Capital of Ireland", 0.0),
        MultiData(4, "New Delhi", "Biggest City in America", 0.0),
        MultiData(5, "Sydney", "Most Polulated city in Australi", 0.0),
        MultiData(6, "Tel Aviv", "Biggest city and Capital of Vegan people", 0.0),
        MultiData(7, "Jerusalem", "Capital of Israel", 0.0),
        MultiData(8, "Berlin", "Germany Capital", 0.0),
        MultiData(9, "Athence", "Capital of Greece", 0.0),
        MultiData(10, "Georgia", "Forgot the name of capital", 0.0),
        MultiData(11, "Stockhold", "Capital of Sweden", 0.0),
        MultiData(12, "Gothenberg", "A city in Sweden", 0.0),
        MultiData(13, "BangKok", "Capital of Thailand", 0.0),
        MultiData(14, "Toranto", "A city in Canada", 0.0),
        MultiData(15, "British Columbia", "A state in Canada", 0.0),
    )
    private lateinit var mAdapter : CityAdapter
    private lateinit var mLayoutManager: LinearLayoutManager
    private lateinit var mRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cities)

        mAdapter = CityAdapter(citiesArray)
        mLayoutManager = LinearLayoutManager(applicationContext)
        mRecyclerView = findViewById(R.id.citiesRecyclerView)
        mRecyclerView.apply {
            adapter = mAdapter
            layoutManager = mLayoutManager
        }
    }
}