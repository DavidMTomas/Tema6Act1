package com.example.tema6act1.pojos

class Disco(
    val imagen: Int?,
    val nombre: String,
    val grupo: String,
    val anyo: String,
    val canciones: ArrayList<Cancion>
) {

    // Con los atributos privados el adapter no muestra cada uno de los atributos
    // cada item aparecia con el atributo del nombre????
    // constructor() : this(null, "", "", "", ArrayList())

//    fun getImagen():Int?{
//        return imagen
//    }
//
//    fun getNombre():String{
//        return nombre
//    }
//
//    fun getGrupo():String{
//        return nombre
//    }
//
//    fun getAnyo():String{
//        return nombre
//    }
//
//    fun getCanciones():ArrayList<Cancion>{
//        return canciones
//    }

    override fun toString(): String {
        return "Disco(nombre='$nombre', grupo='$grupo', anyo='$anyo')"
    }
}

