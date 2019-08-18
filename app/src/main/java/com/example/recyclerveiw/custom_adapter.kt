package com.example.recyclerveiw

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class custom_adapter(val users:ArrayList<user>):RecyclerView.Adapter<custom_adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val new_user:user = users[position]
        holder.txtUser.text = "Name: ${new_user.name}"
        holder.txtPhone.text = "songsa: ${new_user.phoneNumber}"
    }

    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val txtUser = itemView.findViewById<TextView>(R.id.txtName)
        val txtPhone = itemView.findViewById(R.id.txtPhone) as TextView

    }
}