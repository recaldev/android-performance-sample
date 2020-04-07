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

    var friends: List<Friend> by Delegates.observable(
        emptyList(),
        { _, _, _ -> notifyDataSetChanged() }
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_main_adapter, parent, false)
        )
    }

    override fun getItemCount(): Int = friends.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(friends[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var friendAvatar: ImageView = itemView.findViewById(R.id.friend_avatar)
        private var friendName: TextView = itemView.findViewById(R.id.friend_name)
        private var friendDescription: TextView = itemView.findViewById(R.id.friend_description)

        fun bind(friend: Friend) {
            friendName.text = friend.name
            friendDescription.text = friend.description

            if (friend.avatarRes == NO_AVATAR) {
                friendAvatar.setImageResource(R.color.colorPrimary)
            } else {
                Glide.with(itemView.context)
                    .load(friend.avatarRes)
                    .centerCrop()
                    .into(friendAvatar)
            }
        }
    }
}