package com.example.bubble_graph_demo

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_recycler.view.*

class RecyclerAdapter(private val context: Context, val list: MutableList<BubbleClass>) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.single_recycler, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bind(position)
    }

    inner class MyViewHolder(private val root: View) : RecyclerView.ViewHolder(root) {
        fun bind(position: Int) {

            root.card_one.layoutParams.height = list[position].height!!
            root.card_one.layoutParams.width = list[position].width!!
            root.card_one.radius = list[position].radius!!
            root.card_one.setCardBackgroundColor(Color.parseColor(list[position].backgroundColor!!))

            root.findViewById<TextView>(R.id.txt_title_one).text = list[position].title
            root.findViewById<TextView>(R.id.txt_title_one).setTextColor(Color.BLACK)
            root.findViewById<TextView>(R.id.txt_title_one)
                .setTextSize(TypedValue.COMPLEX_UNIT_SP, list[position].titleSize!!)

            root.findViewById<TextView>(R.id.txt_percentage_one).text = list[position].percentage
            root.findViewById<TextView>(R.id.txt_percentage_one).setTypeface(null, Typeface.BOLD)
            root.findViewById<TextView>(R.id.txt_percentage_one).setTextColor(Color.BLACK)
            root.findViewById<TextView>(R.id.txt_percentage_one)
                .setTextSize(TypedValue.COMPLEX_UNIT_SP, list[position].percentageSize!!)
            val params = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            params.gravity = Gravity.CENTER
            root.findViewById<TextView>(R.id.txt_percentage_one).layoutParams = params

        }
    }

}