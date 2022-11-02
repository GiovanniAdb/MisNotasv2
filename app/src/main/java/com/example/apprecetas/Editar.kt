package com.example.apprecetas


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Editar : AppCompatActivity() {

    lateinit var buttonBack: Button
    lateinit var buttonGuardar: Button
    lateinit var buttonEliminar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar)

        //Cancela cambios y se regresa a la pantalla principal
        buttonBack = findViewById(R.id.btnBack)
        buttonBack.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

        //Guarda cambios y se regresa a la pantalla principal
        buttonGuardar = findViewById(R.id.btnGuardar)
        buttonGuardar.setOnClickListener {
            val intentGuardar: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intentGuardar)
        }

        //Elimina la nota/tarea y se regresa a la pantalla principal
        buttonEliminar = findViewById(R.id.btnEliminar)
        buttonEliminar.setOnClickListener {
            val intentEliminar: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intentEliminar)
        }
    }
}