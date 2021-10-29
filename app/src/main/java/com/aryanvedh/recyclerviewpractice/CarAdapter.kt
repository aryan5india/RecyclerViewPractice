package com.aryanvedh.recyclerviewpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class CarAdapter(private val carList: List<MultiData>) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.multy_use_model, parent, false)
        return CarViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.onBind(carList[position])
    }

    override fun getItemCount(): Int = carList.size


    class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val img = itemView.findViewById<CircleImageView>(R.id.profile_image)
        val title = itemView.findViewById<TextView>(R.id.textViewTitle)
        val discription = itemView.findViewById<TextView>(R.id.textViewDescrip)
        val carPrice = itemView.findViewById<TextView>(R.id.textViewPrice)

        fun onBind(data : MultiData){

            title.text = data.title
            discription.text = data.description
            carPrice.text = data.price.toString()
        }

    }
}

