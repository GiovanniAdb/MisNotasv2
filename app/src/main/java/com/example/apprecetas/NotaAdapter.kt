package com.example.apprecetas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apprecetas.databinding.ItemNotaBinding

class NotaAdapter(val notas:List<Nota>):RecyclerView.Adapter<NotaAdapter.RecetaHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecetaHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_nota,parent,false)
        return RecetaHolder(view)
    }

    override fun onBindViewHolder(holder: RecetaHolder, position: Int) {
        val nota = notas[position]
        with(holder){
            binding.tvTitulo.text = nota.nombre.toString()
            binding.tvDescripcion.text = nota.descripcion.toString()
            Glide.with(binding.tvTitulo.context).load(nota.urlFoto)
                .into(binding.imageNota)
        }
    }

    override fun getItemCount(): Int {
        return notas.size
    }

    inner class RecetaHolder(view: View):RecyclerView.ViewHolder(view){
        val binding = ItemNotaBinding.bind(view)
    }
}