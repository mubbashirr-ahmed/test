package com.assesment.testandroid.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.assesment.testandroid.R
import com.assesment.testandroid.model.DataModel

class Adapter(private val ctx: Context, private val list: List<DataModel>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(ctx).inflate(R.layout.item_options, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = list[position]

        with(holder) {
            ivOpt.setImageResource(currentItem.image)
            tvName.text = currentItem.name

            if (position % 2 != 0) {
                ll.setBackgroundColor(ContextCompat.getColor(ctx, R.color.darkBlue) )
                ivNav.setImageResource(R.drawable.nextlight)
                tvName.setTextColor(ContextCompat.getColor(ctx, R.color.lightBlue))
            }
        }
    }

    override fun getItemCount(): Int = list.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivOpt: ImageView = itemView.findViewById(R.id.ivOption)
        val ivNav: ImageView = itemView.findViewById(R.id.ivNav)
        val ll: LinearLayout = itemView.findViewById(R.id.ll)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
    }
}
