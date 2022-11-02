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

class AgregarNota : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var txtTituloNota: TextView
    lateinit var txtDescripcionNota: TextView
    lateinit var buttonRegresarNota: Button
    lateinit var buttonAgregarNota: Button

    private lateinit var mAdapter: NotaAdapter
    private lateinit var mLayoutManager: RecyclerView.LayoutManager

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_nota)

        buttonRegresarNota = findViewById(R.id.btnBackNota)
        buttonRegresarNota.setOnClickListener {
            val intentRegresar: Intent = Intent(this, Agregar:: class.java)
            startActivity(intentRegresar)
        }

        buttonAgregarNota = findViewById(R.id.saveButton)
        buttonAgregarNota.setOnClickListener {
            val intentAgregarNota: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intentAgregarNota)
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
        txtTituloNota = findViewById(R.id.idTitleNota)
        txtDescripcionNota = findViewById(R.id.txtDescripcionNota)

        val primero = Nota(txtTituloNota,
            txtDescripcionNota,
            "https://img.lagaceta.com.ar/fotos/notas/2016/06/28/688251_20160628114236.jpg")
        lista.add(primero)
        return lista
    }
}