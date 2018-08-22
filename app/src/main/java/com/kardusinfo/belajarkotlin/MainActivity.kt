package com.kardusinfo.belajarkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.Toast
import com.kardusinfo.belajarkotlin.adapters.AdapterLv
import com.kardusinfo.belajarkotlin.dataObj.DataLv
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var lv: ListView
    lateinit var adapter:AdapterLv
    lateinit var data:ArrayList<DataLv>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lv = findViewById(R.id.lv)

        data = ArrayList()

        data.add(DataLv(R.drawable.ic_toys_black_24dp,"Fikri Mantab","Tukang Serpis"))
        data.add(DataLv(R.drawable.ic_video_label_black_24dp,"Cobain","Tukang Tikung"))
        data.add(DataLv(R.drawable.ic_toys_black_24dp,"Aduh nih","Joss"))
        data.add(DataLv(R.drawable.ic_video_label_black_24dp,"Cobain","Tukang Tikung"))
        adapter = AdapterLv(applicationContext,data)

        lv.adapter = adapter
    }


}
