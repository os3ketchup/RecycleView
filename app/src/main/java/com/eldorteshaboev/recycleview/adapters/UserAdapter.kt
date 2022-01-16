package com.eldorteshaboev.recycleview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.eldorteshaboev.recycleview.R
import com.eldorteshaboev.recycleview.models.User
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_rv.view.*

class UserAdapter(val context: Context,val list:List<User>):RecyclerView.Adapter<UserAdapter.VH>() {


    inner class VH(var itemView: View):RecyclerView.ViewHolder(itemView){
       fun onBind(user:User){
           itemView.tv_item.text = user.name
           Picasso.get().load(user.imageUrl).into(itemView.image_item)
          itemView.setOnClickListener {  }
           Toast.makeText(context, user.name, Toast.LENGTH_SHORT).show()
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_rv,parent,false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
