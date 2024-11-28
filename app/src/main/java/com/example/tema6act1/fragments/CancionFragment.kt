package com.example.tema6act1.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tema6act1.adapters.CancionAdapter
import com.example.tema6act1.adapters.EventoCancion
import com.example.tema6act1.databinding.FragmentCancionBinding
import com.example.tema6act1.pojos.Disco



class CancionFragment : Fragment() {
    lateinit var binding: FragmentCancionBinding
    lateinit var cancionAdapter: CancionAdapter
    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var itemDecoration: DividerItemDecoration
    lateinit var eventoCancion: EventoCancion
    companion object {
        // Método para crear la instancia del fragmento y pasar el disco
        fun newInstance(disco: Disco): CancionFragment {
            val fragment = CancionFragment()
            val bundle = Bundle()
            bundle.putSerializable("disco", disco)
            fragment.arguments = bundle
            return fragment  }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inicializar el binding antes de inflar la vista
        binding = FragmentCancionBinding.inflate(inflater, container, false)
        val disco = arguments?.getSerializable("disco") as? Disco
        if (disco != null) {
            val listadoCanciones = disco.canciones
            eventoCancion = requireActivity() as EventoCancion // Obtener el EventoCancion de la actividad
            cancionAdapter = CancionAdapter(listadoCanciones, eventoCancion) // Pasar los parámetros al adaptador
            linearLayoutManager = LinearLayoutManager(context)
            itemDecoration = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)

            binding.rvCancionFragment.apply {
                adapter = cancionAdapter
                layoutManager = linearLayoutManager
                addItemDecoration(itemDecoration)
            }
        } else {
            Log.e("CancionFragment", "No se pasó el disco correctamente.")        }
        return binding.root // Devolver la vista raíz
    }
}

