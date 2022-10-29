package com.example.ejercicio3password

import kotlin.math.floor

class Password(private var longitud: Int ) {

    private var contrasena: String = ""

    init{
        this.contrasena = generaContrasena()
    }

    fun getLongitud(): Int {
        return this.longitud
    }

    /*fun setLongitud(longitud: Int) {
        this.longitud = longitud
    }*/

    fun getContrasena(): String {
        return this.contrasena
    }

    fun generaContrasena(): String {
        var contra = ""
        val mayus = 'a'..'z'
        val minus = 'A'..'Z'
        val num = 0..9

        for (i in 0..this.longitud){
            val numRandom = floor(((0..10).random() * 9 + 1).toDouble())
            if (numRandom.toInt() == 1) {
                contra += num.random().toString()
            } else if (numRandom.toInt() == 2) {
                contra += mayus.random().toString()
            } else {
                contra += minus.random().toString()
            }
        }
        return contra
    }

    fun esFuerte(): Boolean {
        var numeros = 0
        var minusculas = 0
        var mayusculas = 0

        for (i in 0..this.contrasena.length) {
            if (this.contrasena.matches("^[a-z]*$".toRegex())) {
                minusculas += 1
            } else if (this.contrasena.matches("^[A-Z]*$".toRegex())) {
                mayusculas += 1
            } else if(this.contrasena.matches("^[0-9]*$".toRegex())){
                numeros += 1
            }
        }

        return numeros >= 5 && minusculas >= 1 && mayusculas >= 2
    }

}