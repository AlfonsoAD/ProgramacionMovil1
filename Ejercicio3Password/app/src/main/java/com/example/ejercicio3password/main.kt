package com.example.ejercicio3password

fun main() {
    println("Ingresa el tamaño del arreglo:")
    val tamano = readln()
    println("Ingresa la longitud de las contraseñas:")
    val longitud = readln()

    val ListaContrasenas = Array(tamano.toInt()){Password(longitud.toInt())}
    val Fortalezas = Array(tamano.toInt()){false}

    for(i in 0..ListaContrasenas.size){
        ListaContrasenas[i]=Password(longitud.toInt())
        Fortalezas[i] = ListaContrasenas[i].esFuerte()
        println("${ListaContrasenas[i].getContrasena()} ${Fortalezas[i]}")
    }
}