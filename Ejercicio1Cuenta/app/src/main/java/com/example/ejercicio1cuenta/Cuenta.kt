package com.example.ejercicio1cuenta

class Cuenta {

    var Titular: String = ""
        get() = field

        set(value) {
        field = value
        }
    var Cantidad: Double = 0.0
        get() = field
        set(value){
        field = value
        }

    constructor (titular:String,cant: Double){
        this.Titular=titular
        this.Cantidad=cant
    }

    constructor(titular: String){
        this.Titular=titular
    }

    fun ingresar (cantidad: Double) : Boolean {
        if (cantidad > 0){
            this.Cantidad = cantidad
            return true
        }else{
            return false
        }
    }

    fun retirar (cantidad: Double): Boolean{

        var retiro = this.Cantidad - cantidad
        if (retiro < 0){
            this.Cantidad = 0.0
            return false
        }else {
            this.Cantidad=retiro
            return true
        }
    }

}