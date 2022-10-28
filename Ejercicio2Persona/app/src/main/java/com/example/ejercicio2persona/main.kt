package com.example.ejercicio2persona

fun main() {
    println("Ingresa tu nombre:")
    var Nombre = readln()
    println("Ingresa tu edad:")
    var Edad = readln()
    println("Ingresa tu sexo (Hombre:H - Mujer:M):")
    var auxSexo = readln()
    var Sexo: Char = auxSexo[0]
    println("Ingresa tu peso(Kg):")
    var Peso = readln()
    println("Ingresa tu altura(Mts):")
    var Altura = readln()

    var miPersona1 = Persona(Nombre, Edad.toInt(), Sexo, Peso.toDouble(), Altura.toDouble())
    var miPersona2 = Persona(Nombre, Edad.toInt(), Sexo)

    var miPersona3 = Persona()
    miPersona3.setNombre("Jesús Alfonso")
    miPersona3.setEdad(22)
    miPersona3.setSexo('H')
    miPersona3.setPeso(80.0)
    miPersona3.setAltura(1.6)

    fun peso(miPersona: Persona) {
        if (miPersona.calcularIMC() == 0) {
            println("Peso ideal")
        } else if (miPersona.calcularIMC() == -1) {
            println("Peso abajo")
        } else if (miPersona.calcularIMC() == 1) {
            println("Sobrepeso")
        }
    }

    fun mayor(miPersona: Persona) {
        if (miPersona.esMayorDeEdad()) {
            println("Es mayor de edad")
        } else {
            println("Es menor de edad")
        }
    }

    println("\nPersona 1")
    peso(miPersona1)
    mayor(miPersona1)
    println(miPersona1.toString())
    println("-------------------------")

    println("\nPersona 2")
    peso(miPersona2)
    mayor(miPersona2)
    println(miPersona2.toString())
    println("-------------------------")

    println("\nPersona 3")
    peso(miPersona3)
    mayor(miPersona3)
    println(miPersona3.toString())
}