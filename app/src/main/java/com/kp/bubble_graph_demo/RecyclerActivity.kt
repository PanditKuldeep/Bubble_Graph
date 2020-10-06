package com.kp.bubble_graph_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*


class RecyclerActivity : AppCompatActivity() {
    private var bubbleList = mutableListOf<BubbleClass>()
    private var adapter:RecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        bubbleList.add(BubbleClass("Equity", "50%", 300, 300, 150f, "#5c6bc0", 24f, 16f))
        bubbleList.add(BubbleClass("Balanced", "25%", 250, 250, 125f, "#ea80fc", 18f, 14f))
        bubbleList.add(BubbleClass("Hybrid", "20%", 200, 200, 100f, "#ffd54f", 16f, 10f))
        bubbleList.add(BubbleClass("Debt", "15%", 150, 150, 75f, "#f06292", 10f, 8f))

        bubbleList.add(BubbleClass("Equity", "50%", 300, 300, 150f, "#5c6bc0", 24f, 16f))
        bubbleList.add(BubbleClass("Balanced", "25%", 250, 250, 125f, "#ea80fc", 18f, 14f))
        bubbleList.add(BubbleClass("Hybrid", "20%", 200, 200, 100f, "#ffd54f", 16f, 10f))
        bubbleList.add(BubbleClass("Debt", "15%", 150, 150, 75f, "#f06292", 10f, 8f))

        bubbleList.add(BubbleClass("Balanced", "25%", 250, 250, 125f, "#ea80fc", 18f, 14f))
        bubbleList.add(BubbleClass("Equity", "50%", 300, 300, 150f, "#5c6bc0", 24f, 16f))
        bubbleList.add(BubbleClass("Hybrid", "20%", 200, 200, 100f, "#ffd54f", 16f, 10f))
        bubbleList.add(BubbleClass("Debt", "15%", 150, 150, 75f, "#f06292", 10f, 8f))

        bubbleList.add(BubbleClass("Balanced", "25%", 250, 250, 125f, "#ea80fc", 18f, 14f))
        bubbleList.add(BubbleClass("Equity", "50%", 300, 300, 150f, "#5c6bc0", 24f, 16f))
        bubbleList.add(BubbleClass("Hybrid", "20%", 200, 200, 100f, "#ffd54f", 16f, 10f))
        bubbleList.add(BubbleClass("Debt", "15%", 150, 150, 75f, "#f06292", 10f, 8f))

        bubbleList.add(BubbleClass("Equity", "50%", 300, 300, 150f, "#5c6bc0", 24f, 16f))
        bubbleList.add(BubbleClass("Hybrid", "20%", 200, 200, 100f, "#ffd54f", 16f, 10f))
        bubbleList.add(BubbleClass("Balanced", "25%", 250, 250, 125f, "#ea80fc", 18f, 14f))
        bubbleList.add(BubbleClass("Debt", "15%", 150, 150, 75f, "#f06292", 10f, 8f))

        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.GAP_HANDLING_NONE)
        recyclerview.layoutManager = layoutManager
        adapter = RecyclerAdapter(this,bubbleList)
        recyclerview.adapter = adapter
    }
}