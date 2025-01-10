package com.example.api_calling_android_d1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.api_calling_android_d1.models.CommentsModel


class CommentsListAdapter(val commentsListData:List<CommentsModel>, val context: Context): BaseAdapter() {
    override fun getCount(): Int {
        return commentsListData.size
    }

    override fun getItem(p0: Int): Any {
        return commentsListData[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var item = commentsListData[p0]
        val itemLayout = LayoutInflater.from(context).inflate(R.layout.todo_list_item,p2,false)
        val idText = itemLayout.findViewById<TextView>(R.id.idTextView)
        val titleText = itemLayout.findViewById<TextView>(R.id.titleTextView)
        val completedStatusText = itemLayout.findViewById<TextView>(R.id.completedStatusTextView)
        val bodyText = itemLayout.findViewById<TextView>(R.id.titleTextView)

        idText.text= item.id.toString()
        titleText.text= item.name.toString()
        completedStatusText.text= item.email.toString()
        bodyText.text= item.body.toString()
        return itemLayout
    }


}