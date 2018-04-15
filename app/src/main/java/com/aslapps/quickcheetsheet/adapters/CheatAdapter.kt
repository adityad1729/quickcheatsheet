package com.aslapps.quickcheetsheet.adapters

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.ViewGroup
import com.aslapps.quickcheetsheet.R
import com.aslapps.quickcheetsheet.database.Cheat
import kotlinx.android.synthetic.main.activity_cheat_sheet.view.*
import java.lang.reflect.Array.set

/**
 * Created by aditya on 15/4/18.
 */
class CheatAdapter : RecyclerView.Adapter<ViewHolder>(val context: Context){
    
    var cheatsList : ArrayList<Cheat> = ArrayList()
        set(value) {
            field = value
        }


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return cheatsList.size
    }

    override fun onCreateViewHoldler(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(from(context).inflate(R.layout.cheatsview, parent, false))
    }

}