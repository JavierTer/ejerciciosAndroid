package ar.edu.ort.challenge3.Entities

class Constructor2 {
    //var nombre: String = nombre
    lateinit var nombre: String

    //no hace falta definir public- por default es todo publico-


    //Sobrecargas de Constructor.

    constructor(nombre: String){
        this.nombre = nombre
    }
    constructor(nombre: String, apellido: String){
    }
    override fun toString(): String {
        return "Constructor3(nombre='$nombre')"
    }

}