package com.assesment.testandroid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val ctx: Context, private val list: ArrayList<DataModel>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(ctx).inflate(R.layout.item_options, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            ivOpt.setImageResource(list[position].image)
            tvName.text = list[position].name
            if (position%2!=0){
                ll.setBackgroundColor(ctx.resources.getColor(R.color.darkBlue))
                ivNav.setImageResource(R.drawable.nextlight)
                tvName.setTextColor(ctx.resources.getColor(R.color.lightBlue))
            }
        }
    }
    override fun getItemCount(): Int {
        return list.size
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var ivOpt: ImageView = itemView.findViewById(R.id.ivOption)
        var ivNav: ImageView = itemView.findViewById(R.id.ivNav)
        var ll: LinearLayout = itemView.findViewById(R.id.ll)
        var tvName: TextView = itemView.findViewById(R.id.tvName)

    }
}