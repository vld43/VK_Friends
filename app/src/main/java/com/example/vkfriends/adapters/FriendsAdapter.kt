package com.example.vkfriends.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vkfriends.R
import com.example.vkfriends.models.FriendModel

class FriendsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var friendsList: ArrayList<FriendModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.cell_friend, parent, false)
        return FriendsViewHolder(itemView = itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int =
        friendsList.count()

    class FriendsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}