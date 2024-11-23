package com.example.tema6act1.pojos

class Cancion(private val num: Int, private val titulo: String, private val duracion: String) {


    fun getNum(): Int {
        return num
    }

    fun getTitulo(): String {
        return titulo
    }

    fun getDuracion(): String {
        return duracion
    }

    override fun toString(): String {
        return "Cancion(num=$num, titulo='$titulo', duracion='$duracion')"
    }


}
