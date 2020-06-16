package com.thefuturestic.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = ArrayList<String>()

        var list = findViewById(R.id.list) as ListView
        // list.setAdapter(adapter)
        val adapter = adapter(this, dataset)
        list.setAdapter(adapter)
        //sample item
        dataset.add("Sample item")
        dataset.add("Sample item")
        dataset.add("Sample item")
        dataset.add("Sample item")
        dataset.add("Sample item")
        dataset.add("Sample item")
        dataset.add("Sample item")
        dataset.add("Sample item")
        dataset.add("Sample item")
        dataset.add("Sample item")

        //adding action listener
        list.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            //handle action here
        })

    }
}