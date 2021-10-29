package com.aryanvedh.recyclerviewpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(private val cityList: List<MultiData>) :
    RecyclerView.Adapter<CityAdapter.CityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.multy_use_model, parent, false)
        return CityViewHolder(view)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.onBind(cityList[position])
    }

    override fun getItemCount(): Int = cityList.size

    class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById<TextView>(R.id.textViewTitle)
        val descrp = itemView.findViewById<TextView>(R.id.textViewDescrip)
        val cityPrice = itemView.findViewById<TextView>(R.id.textViewPrice)

        fun onBind(data: MultiData) {
            title.text = data.title
            descrp.text = data.description
            cityPrice.text = data.price.toString()
        }
    }
}