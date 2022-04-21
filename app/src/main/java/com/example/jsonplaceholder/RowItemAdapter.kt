package com.example.jsonplaceholder

import android.content.Context
import android.inputmethodservice.Keyboard
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_items.view.*

class RowItemAdapter(val context: Context, val userList: List<MyDataItem>): RecyclerView.Adapter<RowItemAdapter.ViewHolder>() {
    class ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView) {
        var userId: TextView
        var title: TextView

        init {
            userId= itemView.userId
            title = itemView.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_items,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userId.text = userList[position].userId.toString()
        holder.title.text = userList[position].title
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}