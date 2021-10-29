package com.aryanvedh.recyclerviewpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val itemArray = listOf<Item>(
        Item("NewTitle 01", "Description 1"),
        Item("NewTitle 02", "Description 2"),
        Item("NewTitle 3", "Description 3"),
        Item("NewTitle 4", "Description 4"),
        Item("NewTitle 5", "Description 5"),
        Item("NewTitle 6", "Description 6"),
        Item("NewTitle 7", "Description 7"),
        Item("NewTitle 8", "Description 8"),
        Item("NewTitle 9", "Description 9"),
        Item("NewTitle 10", "Description 10"),
        Item("NewTitle 11", "Description 11"),
        Item("NewTitle 12", "Description 12"),
        Item("NewTitle 13", "Description 13"),
        Item("NewTitle 14", "Description 14"),
        Item("NewTitle 15", "Description 15"),
        Item("NewTitle 16", "Description 16"),
    )

    private lateinit var mAdapter: ItemAdapter
    private lateinit var mLayoutManager: LinearLayoutManager
    private lateinit var mRecyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAdapter = ItemAdapter(list = itemArray)
        mLayoutManager = LinearLayoutManager(applicationContext)
        mRecyclerView = findViewById(R.id.mainRecyclerView)
        mRecyclerView.apply {
            adapter = mAdapter
            layoutManager = mLayoutManager
        }
    val btnFruit = findViewById<Button>(R.id.button2)
        btnFruit.setOnClickListener {
            startActivity(Intent(this, FruitActivity::class.java))
        }
    val btnCar = findViewById<Button>(R.id.button3)
        btnCar.setOnClickListener {
            startActivity(Intent(this, CarActivity::class.java))
        }
    val btnCities = findViewById<Button>(R.id.button4)
        btnCities.setOnClickListener {
            startActivity(Intent(this, CitiesActivity::class.java))
        }

    }
}








//    private lateinit var mAdapter: ItemAdapter
//    private lateinit var mRecyclerView: RecyclerView
//    private lateinit var mLayoutManager: LinearLayoutManager
//        mAdapter = ItemAdapter(list =itemArray)
//        mLayoutManager = LinearLayoutManager(applicationContext)
//        mRecyclerView = findViewById(R.id.mainRecyclerView)
//        mRecyclerView.apply {
//        layoutManager = mLayoutManager
//            adapter = mAdapter