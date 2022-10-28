package com.example.ejercicio2persona

class Persona {
    private var nombre:String = ""
    private var edad:Int = 0
    private var dni:String = ""
    private var sexo:Char ='M'
    private var peso:Double = 0.0
    private var altura:Double = 0.0

    constructor(){
        this.nombre="";
        this.edad=0;
        this.sexo=' ';
        this.peso=0.0
        this.altura=0.0
        generarDni()
    }

    constructor(nombre:String,edad:Int,sexo:Char){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=0.0
        this.altura=0.0
        generarDni()
    }

    constructor(nombre:String,edad:Int,sexo:Char,peso:Double,altura:Double){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
        generarDni()
    }

    val letraDni: Map<Int, Char> = mapOf(
        0 to 'T',
        1 to 'R',
        2 to 'W',
        3 to 'A',
        4 to 'G',
        5 to 'M',
        6 to 'Y',
        7 to 'F',
        8 to 'P',
        9 to 'D',
        10 to 'X',
        11 to 'B',
        12 to 'N',
        13 to 'J',
        14 to 'Z',
        15 to 'S',
        16 to 'Q',
        17 to 'V',
        18 to 'H',
        19 to 'L',
        20 to 'C',
        21 to 'K',
        22 to 'E',
    )

    fun numsDni() : String {
        var nDni:String=""
        for (i in 1..8 ) {
            val numRandom = (0..10).random()
            nDni += numRandom.toString()
        }

        return nDni
    }

    fun generarDni(){

        var aux = numsDni().toInt() / 23
        var auxLetra = letraDni[aux]
        this.dni= "${aux.toString()}${auxLetra.toString()}"
    }

    fun setNombre(nombre:String) {
        this.nombre = nombre;
    }

    fun setEdad(edad:Int) {
        this.edad = edad;
    }

    fun setSexo(sexo:Char) {
        this.sexo = sexo;
    }

    fun setPeso(peso:Double) {
        this.peso = peso;
    }

    fun setAltura(altura:Double) {
        this.altura = altura;
    }

    fun calcularIMC():Int {
        val pesoIdeal = 0
        val sobrePeso = 1
        val pesoAbajo = -1

        //Calculamos el peso de la persona
        var pesoActual:Double = this.peso / (Math.pow(this.altura, 2.0));

        //Segun el peso, devuelve un codigo
        if (pesoActual >= 20 && pesoActual <= 25) {
            return pesoIdeal;
        } else if (pesoActual < 20) {
            return pesoAbajo;
        } else {
            return sobrePeso;
        }
    }

    fun esMayorDeEdad():Boolean{
        return this.edad > 18
    }

    fun comproobarSexo(){
        if (this.sexo != 'H' && this.sexo != 'M') {
            this.sexo = 'H';
        }
    }

    override fun toString() : String{
        return("Datos de la persona" +
                " DNI: ${dni}, Nombre: ${nombre}, Edad: ${edad}, Sexo: ${sexo}, Peso: ${peso}, Altura:${altura}")
    }
}