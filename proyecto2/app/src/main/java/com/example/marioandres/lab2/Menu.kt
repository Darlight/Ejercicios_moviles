package com.example.marioandres.lab2
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        // Comida en el menu
        var list = arrayOf("Hamburgers","Fish and Chips","Pizza","Shrimps","Lobster","Cream Fish","Crab")

        override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_menu)
            //Sigo sin entender el array adapter
            val adapter = ArrayAdapter(this,R.layout.menu_list_item, list)

            val listView:ListView = findViewById(R.id.menu_list)
            listView.setAdapter(adapter)

            home.setOnClickListener {
                val intento = Intent(this, MainActivity::class.java)
                startActivity(intento)

            }

        }
    }
}
