package com.aslapps.quickcheetsheet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.aslapps.quickcheetsheet.R.id.cheatrow
import com.aslapps.quickcheetsheet.adapters.CheatAdapter
import com.aslapps.quickcheetsheet.database.Cheat

class CheatSheet : AppCompatActivity() {

    var cheatList: ArrayList<Cheat> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    fun createUI(savedInstanceState: Bundle?){
        setContentView(R.layout.activity_cheat_sheet)

        var cheatView = findViewById<RecyclerView>(R.id.cheatsview)
        cheatView.layoutManager = LinearLayoutManager(this)


        var adapter = CheatAdapter()

        adapter.cheatsList = this.cheatList

        cheatView.adapter = adapter

    }
}
