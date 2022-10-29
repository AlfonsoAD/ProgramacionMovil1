package com.example.ejercicio3password

fun main() {
    println("Ingresa el tamaño del arreglo:")
    val tamano = readln()
    println("Ingresa la longitud de las contraseñas:")
    val longitud = readln()
    println("----------------------------------------")

    val ListaContrasenas = Array(tamano.toInt()){Password(longitud.toInt())}
    val Fortalezas = Array(tamano.toInt()){false}

    println("CONTRASEÑA--FORTALEZA")
    println("-----------------------------------")
    for(i in ListaContrasenas.indices){
        ListaContrasenas[i]=Password(longitud.toInt())
        Fortalezas[i] = ListaContrasenas[i].esFuerte()
        println("${ListaContrasenas[i].getContrasena()} ${Fortalezas[i]}")
    }
}