package com.example.marioandres.myapplication

import android.app.Application
import com.example.marioandres.myapplication.Models.Contact

//Esta clase permite ser referenciado en busca de variables
//o metodos que usan todas las activities
class MyApplication:Application() {
    //Este companion object define variables usadas para todas las activitities
    companion object {
        val contacts: ArrayList<Contact> = ArrayList()
            get() = field
    }
}