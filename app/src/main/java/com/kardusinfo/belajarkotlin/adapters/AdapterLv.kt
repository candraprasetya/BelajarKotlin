package com.kardusinfo.belajarkotlin.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.kardusinfo.belajarkotlin.R
import com.kardusinfo.belajarkotlin.dataObj.DataLv

class AdapterLv(var context:Context, var data:ArrayList<DataLv>): BaseAdapter(){

    lateinit var img:ImageView
    lateinit var channel:TextView
    lateinit var service:TextView

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
    var view = LayoutInflater.from(context).inflate(R.layout.lv_items,parent,false)

        img = view.findViewById(R.id.img)
        channel = view.findViewById(R.id.channel)
        service = view.findViewById(R.id.service)

        img.setImageResource(data.get(position).img)
        channel.text = data.get(position).channel
        service.text = data.get(position).service

        return view
    }

    override fun getItem(position: Int): Any {
        return data.get(position)
    }

    override fun getItemId(position: Int): Long {
    return position.toLong()
    }

    override fun getCount(): Int {
    return data.size
    }

}