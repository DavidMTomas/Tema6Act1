package com.example.tema6act1.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tema6act1.adapters.DiscoApadter
import com.example.tema6act1.adapters.EventoDisco
import com.example.tema6act1.databinding.FragmentDiscoBinding
import com.example.tema6act1.pojos.DatosDiscos

class DiscoFragment : Fragment() {

    lateinit var binding: FragmentDiscoBinding
    lateinit var discoApadter: DiscoApadter
    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var eventoDisco: EventoDisco

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDiscoBinding.inflate(inflater, container, false)

        eventoDisco = requireActivity() as EventoDisco
        discoApadter = DiscoApadter(DatosDiscos.datos, eventoDisco)
        linearLayoutManager = LinearLayoutManager(context)

        binding.rvDiscoFragment.apply {
            // Verifica que la lista de datos no esté vacía antes de asignar el adaptador
            if (DatosDiscos.datos.isNotEmpty()) {
                adapter = discoApadter
                layoutManager = linearLayoutManager
            } else {
                Log.e("DiscoFragment", "La lista de discos está vacía")
            }
        }

        // Inflate the layout for this fragment
        return binding.root
    }


}