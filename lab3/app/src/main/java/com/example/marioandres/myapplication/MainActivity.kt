package com.example.marioandres.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.os.Bundle
import android.provider.Contacts
import android.provider.ContactsContract
import android.support.v7.widget.RecyclerView
import android.widget.Button
import com.example.marioandres.myapplication.Adapters.ContactAdapter

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Asigno una variable la lista de contactos que es estatica
        val listContacts= MyApplication.contacts
        val showContacts = findViewById<RecyclerView>(R.id.recycler_view)
        //Esto crea una vista vertical para los contactos
        showContacts.layoutManager = LinearLayoutManager(this)
        showContacts.adapter = ContactAdapter(listContacts,this)
        // Asigno una variable el boton que permite iniciar la otra actividad
        val showAddButton = findViewById<Button>(R.id.add_contact_button)

        showAddButton.setOnClickListener {
            startActivity(Intent(this, AddContact::class.java ))
        }


    }

}
