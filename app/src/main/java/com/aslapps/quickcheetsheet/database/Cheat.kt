package com.aslapps.quickcheetsheet.database

import io.objectbox.annotation.Convert
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

/**
 * Created by aditya on 15/4/18.
 */
@Entity data class Cheat(var id: Id, var cheattitle: String){

}