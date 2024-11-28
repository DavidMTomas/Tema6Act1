package com.example.tema6act1.activties

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tema6act1.R
import com.example.tema6act1.adapters.EventoCancion
import com.example.tema6act1.adapters.EventoDisco
import com.example.tema6act1.databinding.ActivityMainBinding
import com.example.tema6act1.fragments.CancionFragment
import com.example.tema6act1.fragments.DiscoFragment
import com.example.tema6act1.pojos.Cancion
import com.example.tema6act1.pojos.Disco

class MainActivity : AppCompatActivity(), EventoDisco, EventoCancion{
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
        // Iniciamos el fragmento de discos
        if (savedInstanceState == null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentDiscos, DiscoFragment())
            transaction.commitNow()
        }
    }
    override fun verCanciones(disco: Disco) {
        val cancionFragment = CancionFragment.newInstance(disco)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentCanciones, cancionFragment)
        transaction.addToBackStack(null)  // Opcional, solo si quieres permitir retroceder
        transaction.commit()
    }

    //Metodo de evento lista
    override fun mostrarDetalleCancion(cancion: Cancion) {
        Toast.makeText(this, "${cancion.num} - ${cancion.duracion}", Toast.LENGTH_SHORT).show()
    }
//    fun volverMain(){
//        // Ocultar el fragmento de discos
//        findViewById<FrameLayout>(R.id.fragmentDiscos).visibility = View.VISIBLE
//
////        // Mostrar el fragmento de canciones
////        findViewById<FrameLayout>(R.id.fragmentCanciones).visibility = View.GONE
//    }
}