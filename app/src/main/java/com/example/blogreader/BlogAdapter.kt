package com.example.blogreader

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter (var blogList: List<Author>): RecyclerView.Adapter<BlogViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}


class BlogViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvAuthor = itemView.findViewById<TextView>(R.id.tvAvatar)
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    var tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
    var tvImage = itemView.findViewById<TextView>(R.id.tvImage)
    var tvTile = itemView.findViewById<TextView>(R.id.tvBookTitle)
    var tvLink = itemView.findViewById<TextView>(R.id.tvLink)
}
