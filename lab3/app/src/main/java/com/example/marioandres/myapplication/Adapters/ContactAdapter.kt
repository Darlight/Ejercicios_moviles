package com.example.marioandres.myapplication.Adapters

import android.content.Context
import android.support.constraint.R.id.parent
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.View
import android.view.ViewGroup
import com.example.marioandres.myapplication.Models.Contact
import com.example.marioandres.myapplication.R
import kotlinx.android.synthetic.main.contact_list_item.view.*

class ContactAdapter(private val persons: ArrayList<Contact>, val context: Context):
    RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(from(context).inflate(R.layout.contact_list_item, parent , false))//To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return persons.size //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        return //To change body of created functions use File | Settings | File Templates.
    }


}