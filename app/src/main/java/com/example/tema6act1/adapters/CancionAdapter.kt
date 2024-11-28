package com.example.tema6act1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tema6act1.R
import com.example.tema6act1.databinding.ItemListadoBinding
import com.example.tema6act1.pojos.Cancion

class CancionAdapter(var lista:List<Cancion>, var eventoCancion: EventoCancion)
    :RecyclerView.Adapter<CancionAdapter.ViewHolder>() {

    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val binding = ItemListadoBinding.bind(view)
        fun render(cancion: Cancion) {
            binding.tvNumeroCancion.text=cancion.num.toString()
            binding.tvNombreCancion.text=cancion.titulo
            binding.tvDuracionCancion.text=cancion.duracion
            setEventoCancion(cancion)
        }
        private fun setEventoCancion(cancion: Cancion) {
                    binding.root.setOnClickListener {
                        eventoCancion.mostrarDetalleCancion(cancion)
                    }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_listado,parent,false))
    }
    override fun getItemCount(): Int=lista.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.render(lista[position])
    }
}