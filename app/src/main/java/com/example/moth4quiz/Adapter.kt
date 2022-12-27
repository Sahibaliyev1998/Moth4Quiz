package com.example.moth4quiz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moth4quiz.databinding.ActivityMainBinding
import com.example.moth4quiz.databinding.ItemuserBinding

class Adapter( var userlist:ArrayList<User> , val itemClickListener : (Int)->Unit):RecyclerView.Adapter<Adapter.UserHolder>() {
    inner class UserHolder (val binding: ItemuserBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val binding = ItemuserBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
        return UserHolder(binding)
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {

        holder.binding.txtName.text =userlist[position].name
        holder.binding.txtSurname.text =userlist[position].Surname
        holder.binding.txtId.text = userlist[position].id.toString()
        holder.binding.txtAge.text = userlist[position].age

        holder.itemView.setOnClickListener {
            itemClickListener(position)
        }



    }

    override fun getItemCount(): Int {
        return userlist.count()
    }


    interface OnItemSelected{
        fun onItemSelected(id : Int)
    }
}