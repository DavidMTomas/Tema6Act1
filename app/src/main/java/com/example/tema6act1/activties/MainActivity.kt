package com.example.tema6act1.activties

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tema6act1.R
import com.example.tema6act1.adapters.DiscoApadter
import com.example.tema6act1.databinding.ActivityMainBinding
import com.example.tema6act1.fragments.DiscoFragment
import com.example.tema6act1.pojos.DatosDiscos

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Iniciamos en La lista de discos
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentDiscos, DiscoFragment())
        // transaction.addToBackStack(null)  // Solo lo agregas si no está ya en el back stack
        transaction.commitNow()


    }
}