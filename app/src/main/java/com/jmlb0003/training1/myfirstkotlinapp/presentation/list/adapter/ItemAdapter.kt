package com.jmlb0003.training1.myfirstkotlinapp.presentation.list.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.jmlb0003.training1.myfirstkotlinapp.R
import com.jmlb0003.training1.myfirstkotlinapp.model.Item
import com.jmlb0003.training1.myfirstkotlinapp.utils.inflate
import com.jmlb0003.training1.myfirstkotlinapp.utils.loadUrl
import kotlinx.android.synthetic.main.list_item.view.*

class ItemAdapter(val items: List<Item>, val listener: (Item) -> Unit) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int):
            ViewHolder {

        return ViewHolder(parent.inflate(R.layout.list_item))
    }

    override fun onBindViewHolder(
            holder: ViewHolder,
            position: Int) = with(holder.itemView) {

        val item = items[position]
        image_title.text = item.title
        image.loadUrl(item.url)

        setOnClickListener { listener(item) }
    }

    override fun getItemCount() = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

}
