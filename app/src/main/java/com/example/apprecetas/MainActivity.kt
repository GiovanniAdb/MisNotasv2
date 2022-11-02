package com.example.apprecetas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apprecetas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var buttonSumar: Button

    private lateinit var mAdapter: NotaAdapter
    private lateinit var mLayoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        buttonSumar = findViewById(R.id.btnAgregar)
        buttonSumar.setOnClickListener {
            val intent: Intent = Intent(this, Agregar:: class.java)
            startActivity(intent)
        }

        mAdapter= NotaAdapter(cargarLista())
        mLayoutManager=LinearLayoutManager(this)

        binding.recyclerview.apply {
            adapter=mAdapter
            layoutManager=mLayoutManager
        }
    }

    fun cargarLista():MutableList<Nota>{
        val lista= mutableListOf<Nota>()
        /*
        lista.add(tucumanas)
        */
        return lista
    }
}