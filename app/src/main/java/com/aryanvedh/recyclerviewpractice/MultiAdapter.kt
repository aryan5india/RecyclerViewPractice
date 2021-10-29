package com.aryanvedh.recyclerviewpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class MultiAdapter (private val list: List<MultiData>) :
    RecyclerView.Adapter<MultiAdapter.FruitsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.multy_use_model, parent, false)
        return FruitsViewHolder(view)
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size


    class FruitsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val img = itemView.findViewById<CircleImageView>(R.id.profile_image)
        val title = itemView.findViewById<TextView>(R.id.textViewTitle)
        val discrip = itemView.findViewById<TextView>(R.id.textViewDescrip)
        val price = itemView.findViewById<TextView>(R.id.textViewPrice)

        fun onBind(data : MultiData) {
            title.text = data.title
            discrip.text = data.description
            price.text = data.price.toString()
        }
    }
}