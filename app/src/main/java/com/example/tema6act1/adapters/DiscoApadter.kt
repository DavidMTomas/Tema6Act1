package com.example.tema6act1.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tema6act1.R
import com.example.tema6act1.databinding.ItemDiscoBinding

import com.example.tema6act1.pojos.Disco

class DiscoApadter(var lista: ArrayList<Disco>) : RecyclerView.Adapter<DiscoApadter.ViewHolder>() {
    lateinit var context: Context

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemDiscoBinding.bind(view)
        fun render(disco: Disco) {
            disco.imagen?.let { binding.imDisco.setImageResource(it) }
            binding.tvNombreDisco.text = disco.nombre
            binding.tvNombreGrupo.text = disco.grupo
            binding.tvAnyoDisc.text = disco.anyo
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_disco, parent, false)
        )
    }

    override fun getItemCount(): Int = lista.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.render(lista[position])
    }
}