package com.example.lahagora

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(var context: Context, var mainModels: ArrayList<MainModel>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imageView : ImageView
        var textView : TextView

        init {
            imageView = itemView.findViewById(R.id.image_view)
            textView = itemView.findViewById(R.id.textView)
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
    var view : View = LayoutInflater.from(parent.context).inflate(R.layout.row_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        holder.imageView.setImageResource(mainModels.get(position).langlogo)
        holder.textView.setText(mainModels.get(position).langName)

    }

    override fun getItemCount(): Int {
      return mainModels.size
    }

}
