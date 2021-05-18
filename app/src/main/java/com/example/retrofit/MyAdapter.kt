package com.example.retrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_items.view.*

class MyAdapter(private var context: Context, private var userList: List<MyDataItem>):RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        var userId: TextView = itemView.userList
        var title: TextView = itemView.tiTle
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val itemView=LayoutInflater.from(context).inflate(R.layout.row_items,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.userId.text=userList[position].userId.toString()
        holder.title.text=userList[position].title
    }

    override fun getItemCount(): Int {
       return userList.size
    }
}