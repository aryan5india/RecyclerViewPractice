package com.aryanvedh.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CarActivity : AppCompatActivity() {

    private lateinit var mAdapter: CarAdapter
    private lateinit var mLayoutManager: LinearLayoutManager
    private lateinit var mRecyclerView: RecyclerView
    private val carArray = listOf<MultiData>(
        MultiData(1, "Rolls Royas", "The most expensive Car", 2500000.00),
        MultiData(2, "Astin Martin", "Beautiful racing Car", 150000.00),
        MultiData(3, "Ferray", "Italian racing Car", 200000.00),
        MultiData(4, "Astin Martin", "Beautiful racing Car", 150000.00),
        MultiData(5, "Ferray", "Italian racing Car", 200000.00),
        MultiData(6, "Astin Martin", "Beautiful racing Car", 150000.00),
        MultiData(7, "Ferray", "Italian racing Car", 200000.00),
        MultiData(8, "Astin Martin", "Beautiful racing Car", 150000.00),
        MultiData(9, "Ferray", "Italian racing Car", 200000.00),
        MultiData(10, "Rolls Royas", "The most expensive Car", 2.50000),
        MultiData(11, "Astin Martin", "Beautiful racing Car", 1.50000),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car)

        mAdapter = CarAdapter(carArray)
        mLayoutManager = LinearLayoutManager(applicationContext)
        mRecyclerView = findViewById(R.id.carRecyclerView)
        mRecyclerView.apply {
            adapter = mAdapter
            layoutManager = mLayoutManager
        }

    }
}