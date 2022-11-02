package com.example.apprecetas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apprecetas.databinding.ActivityMainBinding

class AgregarTarea : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var buttonRegresarTarea: Button
    lateinit var buttonAgregarTarea: Button
    lateinit var txtTitulo: TextView
    lateinit var txtDescripcion: TextView

    private lateinit var mAdapter: NotaAdapter
    private lateinit var mLayoutManager: RecyclerView.LayoutManager

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_tarea)

        buttonRegresarTarea = findViewById(R.id.btnBackTarea)
        buttonRegresarTarea.setOnClickListener {
            val intentRegresarTarea: Intent = Intent(this, Agregar:: class.java)
            startActivity(intentRegresarTarea)
        }

        buttonAgregarTarea = findViewById(R.id.btnGuardarTarea)
        buttonAgregarTarea.setOnClickListener {
            val intentAgregarTarea: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intentAgregarTarea)
            mAdapter= NotaAdapter(sumarLista())
        }
        mLayoutManager= LinearLayoutManager(this)

        binding.recyclerview.apply {
            adapter=mAdapter
            layoutManager=mLayoutManager
        }
    }

    fun sumarLista():MutableList<Nota>{
        val lista= mutableListOf<Nota>()
          txtTitulo = findViewById(R.id.idTitle)
          txtDescripcion = findViewById(R.id.txtDescripcionTarea)

        val primero = Nota(txtTitulo,
            txtDescripcion,
            "https://img.lagaceta.com.ar/fotos/notas/2016/06/28/688251_20160628114236.jpg")
        lista.add(primero)
        return lista
    }
}