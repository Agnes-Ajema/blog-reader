package com.example.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter (var blogList: List<Author>): RecyclerView.Adapter<BlogViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_card,parent,false)
        return BlogViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
      var blog = blogList[position]
        holder.tvTitle.text=blog.title
        holder.tvLink.text=blog.link
        holder.tvDate.text=blog.pubDate
        holder.tvName.text=blog.name
        holder.tvPreview.text=blog.articlePreview
    }

    override fun getItemCount(): Int {
       return blogList.size
    }
}


class BlogViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    var tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvBookTitle)
    var tvLink = itemView.findViewById<TextView>(R.id.tvLink)
}
