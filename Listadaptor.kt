package com.example.listvvewicon

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Listadaptor(var mCtx:Context, var resource:Int, var items: List<Model>)
    :ArrayAdapter<Model>(mCtx,resource,items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val layout:LayoutInflater=LayoutInflater.from(mCtx)
            val view:View=layout.inflate(resource,null)
            val imageView:ImageView= view.findViewById(R.id.iconIv)
            val textView:TextView= view.findViewById(R.id.TitleTv)
            var mItems:Model=items[position]

        imageView.setImageDrawable(mCtx.resources.getDrawable(mItems.photo))
        textView.text=mItems.title

        return view
    }
}
