package com.aryanvedh.recyclerviewpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val list: List<Item>) : RecyclerView.Adapter<ItemAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_model, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    class MyViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){

        private val title = itemview.findViewById<TextView>(R.id.textView)
        private val descp = itemview.findViewById<TextView>(R.id.textView2)

        fun onBind(data : Item){
            title.text = data.title
            descp.text = data.description
        }
    }
}
























//private val list: List<Item>
//RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_model, parent, false)
//        return ItemViewHolder(view)
//
//    }
//
//    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//        holder.onBind(list[position])
//    }
//
//    override fun getItemCount(): Int = list.size
//
//    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        private val title = itemView.findViewById<TextView>(R.id.textView)
//        private val descp = itemView.findViewById<TextView>(R.id.textView2)
//
//        fun onBind(data: Item) {
//            title.text = data.title
//            descp.text = data.description
//        }
//    }
