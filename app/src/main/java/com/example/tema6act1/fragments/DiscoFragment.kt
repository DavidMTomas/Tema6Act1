package com.example.tema6act1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tema6act1.R
import com.example.tema6act1.adapters.DiscoApadter
import com.example.tema6act1.databinding.FragmentDiscoBinding
import com.example.tema6act1.pojos.DatosDiscos

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DiscoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DiscoFragment : Fragment() {
    lateinit var binding: FragmentDiscoBinding
    lateinit var discoApadter: DiscoApadter
    lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDiscoBinding.inflate(inflater, container, false)

        discoApadter = DiscoApadter(DatosDiscos.datos)
        linearLayoutManager = LinearLayoutManager(context)

        binding.rvDiscoFragment.apply {
            adapter = discoApadter
            layoutManager = linearLayoutManager
        }

        // Inflate the layout for this fragment
        return binding.root
    }


}