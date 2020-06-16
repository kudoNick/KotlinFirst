package com.example.kotlinfirst

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class DataAdapter(var context: Context, var dataList: ArrayList<Data>) : BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?

        var viewHolder: ViewHolder
        if (convertView == null) {
            var layoutInflater: LayoutInflater = LayoutInflater.from(context)
            view=layoutInflater.inflate(R.layout.data,null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }

        var data: Data = getItem(position) as Data
        viewHolder.tvName.text = data.getName()
     return view as View
    }

    override fun getItem(position: Int): Any {
        return dataList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return dataList.size
    }

    class ViewHolder(view: View){
        var tvName: TextView

        init {
            tvName = view.findViewById(R.id.tvNameDialog)
        }
    }

}