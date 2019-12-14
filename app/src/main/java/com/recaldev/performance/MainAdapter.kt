package com.recaldev.performance

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlin.properties.Delegates

const val NO_AVATAR = 0

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    var globers: List<Glober> by Delegates.observable(
        emptyList(),
        { _, _, _ -> notifyDataSetChanged() }
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_main_adapter, parent, false)
        )
    }

    override fun getItemCount(): Int = globers.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(globers[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var globerAvatar: ImageView = itemView.findViewById(R.id.glober_avatar)
        private var globerName: TextView = itemView.findViewById(R.id.glober_name)
        private var globerDescription: TextView = itemView.findViewById(R.id.glober_description)

        fun bind(glober: Glober) {
            globerName.text = glober.name
            globerDescription.text = glober.description

            if (glober.avatarRes == NO_AVATAR) {
                globerAvatar.setImageResource(R.color.colorPrimary)
            } else {
                Glide.with(itemView.context)
                    .load(glober.avatarRes)
                    .centerCrop()
                    .into(globerAvatar)
            }
        }
    }
}