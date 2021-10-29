package com.aryanvedh.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FruitActivity : AppCompatActivity() {

    private val fruitArray = listOf<MultiData>(
        MultiData(1, "Mango", "Mango is healthy fruit", 2.5),
        MultiData(2, "PineApple", "PineApple is Vitamin C Rich fruit", 2.5),
        MultiData(1, "Mango", "Mango is healthy fruit", 2.5),
        MultiData(2, "PineApple", "PineApple is Vitamin C Rich fruit", 2.5),
        MultiData(1, "Mango", "Mango is healthy fruit", 2.5),
        MultiData(2, "PineApple", "PineApple is Vitamin C Rich fruit", 2.5),
        MultiData(1, "Mango", "Mango is healthy fruit", 2.5),
        MultiData(2, "PineApple", "PineApple is Vitamin C Rich fruit", 2.5),
        MultiData(1, "Mango", "Mango is healthy fruit", 2.5),
        MultiData(2, "PineApple", "PineApple is Vitamin C Rich fruit", 2.5),
        MultiData(1, "Mango", "Mango is healthy fruit", 2.5),
        MultiData(2, "PineApple", "PineApple is Vitamin C Rich fruit", 2.5),
        MultiData(1, "Mango", "Mango is healthy fruit", 2.5),
        MultiData(2, "PineApple", "PineApple is Vitamin C Rich fruit", 2.5),

        )
    private lateinit var mAdapter: MultiAdapter
    private lateinit var mLayoutManager: LinearLayoutManager
    private lateinit var mRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit)

        mAdapter = MultiAdapter(list = fruitArray)
        mLayoutManager = LinearLayoutManager(applicationContext)
        mRecyclerView = findViewById(R.id.fruitRecyclerView)
        mRecyclerView.apply {
            adapter = mAdapter
            layoutManager = mLayoutManager
        }
    }
}
