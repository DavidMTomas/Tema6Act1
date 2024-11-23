package com.example.tema6act1.pojos

import com.example.tema6act1.R

class DatosDiscos {
    companion object{
        val datos = arrayListOf(
            Disco(
                imagen = R.drawable.album,
                nombre = "Abbey Road",
                grupo = "The Beatles",
                anyo = "1969",
                canciones = arrayListOf(
                    Cancion(1, "Come Together", "4:20"),
                    Cancion(2, "Something", "3:03"),
                    Cancion(3, "Maxwell's Silver Hammer", "3:27"),
                    Cancion(4, "Oh! Darling", "3:26"),
                    Cancion(5, "Octopus's Garden", "2:50"),
                    Cancion(6, "I Want You (She’s So Heavy)", "7:47"),
                    Cancion(7, "Here Comes the Sun", "3:05")
                )
            ),
            Disco(
                imagen = R.drawable.album,
                nombre = "The Dark Side of the Moon",
                grupo = "Pink Floyd",
                anyo = "1973",
                canciones = arrayListOf(
                    Cancion(1, "Speak to Me", "1:30"),
                    Cancion(2, "Breathe", "2:49"),
                    Cancion(3, "On the Run", "3:30"),
                    Cancion(4, "Time", "6:53"),
                    Cancion(5, "The Great Gig in the Sky", "4:44"),
                    Cancion(6, "Money", "6:30"),
                    Cancion(7, "Us and Them", "7:32")
                )
            ),
            Disco(
                imagen = R.drawable.album,
                nombre = "Hotel California",
                grupo = "Eagles",
                anyo = "1976",
                canciones = arrayListOf(
                    Cancion(1, "Hotel California", "6:30"),
                    Cancion(2, "New Kid in Town", "5:04"),
                    Cancion(3, "Life in the Fast Lane", "4:29"),
                    Cancion(4, "Wasted Time", "4:54"),
                    Cancion(5, "Victim of Love", "4:11"),
                    Cancion(6, "Pretty Maids All in a Row", "4:05"),
                    Cancion(7, "Try and Love Again", "5:10")
                )
            ),
            Disco(
                imagen = R.drawable.album,
                nombre = "Back in Black",
                grupo = "AC/DC",
                anyo = "1980",
                canciones = arrayListOf(
                    Cancion(1, "Hells Bells", "5:12"),
                    Cancion(2, "Shoot to Thrill", "5:17"),
                    Cancion(3, "What Do You Do for Money Honey", "3:34"),
                    Cancion(4, "Given the Dog a Bone", "3:30"),
                    Cancion(5, "Let Me Put My Love Into You", "4:16"),
                    Cancion(6, "Back in Black", "4:14"),
                    Cancion(7, "Rock and Roll Ain't Noise Pollution", "4:12")
                )
            ),
            Disco(
                imagen = R.drawable.album,
                nombre = "Thriller",
                grupo = "Michael Jackson",
                anyo = "1982",
                canciones = arrayListOf(
                    Cancion(1, "Wanna Be Startin' Somethin'", "6:03"),
                    Cancion(2, "Baby Be Mine", "4:20"),
                    Cancion(3, "The Girl Is Mine", "3:42"),
                    Cancion(4, "Thriller", "5:57"),
                    Cancion(5, "Beat It", "4:18"),
                    Cancion(6, "Billie Jean", "4:54"),
                    Cancion(7, "Human Nature", "4:06")
                )
            ),
            Disco(
                imagen = R.drawable.album,
                nombre = "The Wall",
                grupo = "Pink Floyd",
                anyo = "1979",
                canciones = arrayListOf(
                    Cancion(1, "In the Flesh?", "3:17"),
                    Cancion(2, "The Thin Ice", "2:27"),
                    Cancion(3, "Another Brick in the Wall, Pt. 1", "3:15"),
                    Cancion(4, "Mother", "5:32"),
                    Cancion(5, "Goodbye Blue Sky", "2:46"),
                    Cancion(6, "Hey You", "4:40"),
                    Cancion(7, "Comfortably Numb", "6:53")
                )
            ),
            Disco(
                imagen = R.drawable.album,
                nombre = "Born to Run",
                grupo = "Bruce Springsteen",
                anyo = "1975",
                canciones = arrayListOf(
                    Cancion(1, "Thunder Road", "4:49"),
                    Cancion(2, "Tenth Avenue Freeze-Out", "3:05"),
                    Cancion(3, "Night", "3:00"),
                    Cancion(4, "Backstreets", "6:30"),
                    Cancion(5, "Born to Run", "4:30"),
                    Cancion(6, "She’s the One", "4:30"),
                    Cancion(7, "Jungleland", "9:34")
                )
            )
        )
    }
}