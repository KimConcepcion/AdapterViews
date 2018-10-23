package dk.pme.kim.adapterviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.grid_view.*
import kotlinx.android.synthetic.main.list_view.*
import kotlinx.android.synthetic.main.spinner_view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spinner_view)

        //  Arraylist:
        val topics = ArrayList<String>()
        topics.add("Android Studio")
        topics.add("Kotlin vs Java")
        topics.add("Activities")
        topics.add("Intents")
        topics.add("Ressources")
        topics.add("AdapterViews")
        topics.add("Navigation")
        topics.add("Fragments")

        //  Arrayadapter:
        //val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arraylist)
        val adapter = ArrayAdapter(this, R.layout.list_item, topics)

        //listView.adapter = adapter
        //gridView.adapter = adapter

    }
}