package com.example.ejercicio3password

import kotlin.math.floor

class Password(private var longitud: Int) {

    private var contrasena: String = ""

    init {
        this.contrasena = generaContrasena()
    }

    fun getLongitud(): Int {
        return this.longitud
    }

    fun setLongitud(longitud: Int) {
        this.longitud = longitud
    }

    fun getContrasena(): String {
        return this.contrasena
    }

    fun generaContrasena(): String {
        var contra = ""

        for (i in 0..this.longitud) {
            val numRandom = floor(((0..10).random() * 3 + 1).toDouble())

            if (numRandom.toInt() == 1) {
                val minusculas: Char = ((floor(((0..10).random() * (123 - 97) + 97).toDouble())).toInt()).toChar()
                    contra += minusculas.toString()
                } else if (numRandom.toInt() == 2) {
                    val mayusculas: Char = ((floor(((0..10).random() * (91 - 65) + 65).toDouble())).toInt()).toChar()
                    contra += mayusculas.toString()
                } else {
                    val numeros: Char = ((floor(((0..10).random() * (58 - 48) + 48).toDouble())).toInt()).toChar()
                    contra += numeros.toString()
                }
            }
        return contra
    }

    fun esFuerte(): Boolean {
        var numeros = 0
        var minusculas = 0
        var mayusculas = 0

        for (i in 0..contrasena.length) {
            if ((contrasena[i].toString()).toInt() in 97..122) {
                minusculas += 1
            } else if ((contrasena[i].toString()).toInt() in 65..90) {
                mayusculas += 1
            } else {
                numeros += 1
            }
        }

        return numeros >= 5 && minusculas >= 1 && mayusculas >= 2
    }

}