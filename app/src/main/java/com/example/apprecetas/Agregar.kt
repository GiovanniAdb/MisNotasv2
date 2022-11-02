package com.example.apprecetas


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Agregar : AppCompatActivity() {

    lateinit var buttonBackRegistrar: Button
    lateinit var buttonAgregarNota: Button
    lateinit var buttonAgregarTarea: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar)

        //Cuando de clic en el boton Back, se cancelara el registro y se regresa a la primer pantalla
        buttonBackRegistrar = findViewById(R.id.btnBackRegistrar)
        buttonBackRegistrar.setOnClickListener {
            val intentBack: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intentBack)
        }

        //Cuando de clic en el boton de agregar nota se ira a la pantalla respectiva
        buttonAgregarNota = findViewById(R.id.btnRegistrarAgregarNOTA)
        buttonAgregarNota.setOnClickListener {
            val intentNota: Intent = Intent(this, AgregarNota:: class.java)
            startActivity(intentNota)
        }

        //Cuando de clic en el boton de agregar tarea se ira a la pantalla respectiva
        buttonAgregarTarea = findViewById(R.id.btnRegistrarAgregarTAREA)
        buttonAgregarTarea.setOnClickListener {
            val intentTarea: Intent = Intent(this, AgregarTarea:: class.java)
            startActivity(intentTarea)
        }
    }
}