package com.example.ejercicio1cuenta

fun main (){
    val miCuenta = Cuenta("Jesús Alfonso",450000.00);

    var deposito = miCuenta.ingresar(5000.0)

    if(deposito) {
        println("Deposito exitoso")
    }

    var retiro = miCuenta.retirar(10000.00)

    if(retiro) {
        println("Retiro exitoso")
    }
}