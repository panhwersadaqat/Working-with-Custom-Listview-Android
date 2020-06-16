package com.thefuturestic.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import java.util.*

class adapter(
    context: Context?,
    web: ArrayList<String>
) : ArrayAdapter<String?>(context!!, 0, web as List<String?>) {
    private val web: ArrayList<String>
    var mInflater: LayoutInflater
    override fun getView(
        position: Int,
        view: View?,
        parent: ViewGroup
    ): View {
        val rowView = mInflater.inflate(R.layout.item_view, parent, false)
        val txtTitle =
            rowView.findViewById<View>(R.id.clothe_item_text) as TextView
        txtTitle.text = web[position]
        return rowView
    }

    init {
        mInflater = LayoutInflater.from(context)
        this.web = web
    }
}