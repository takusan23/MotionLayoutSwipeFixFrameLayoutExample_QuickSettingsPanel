package io.github.takusan23.motionlayoutswipefixframelayoutexample_backdrop.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.github.takusan23.motionlayoutswipefixframelayoutexample_backdrop.DataClass.ListData
import io.github.takusan23.motionlayoutswipefixframelayoutexample_quicksettingspanel.R

/** MainActivityに表示するRecyclerViewのAdapter */
class ListAdapter(val list: ArrayList<ListData>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.adapter_imageview)
        val titleTextView = itemView.findViewById<TextView>(R.id.adapter_textview_title)
        val descriptionTextView = itemView.findViewById<TextView>(R.id.adapter_textview_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_video, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.apply {
            imageView.setImageDrawable(item.drawable)
            titleTextView.text = item.title
            descriptionTextView.text = item.description
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}