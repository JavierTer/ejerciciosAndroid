package ar.edu.ort.challenge6.listener

import ar.edu.ort.challenge6.model.Product
/*
* La interface se implementará cuando se quiera manejar la selección de 1 producto en una clase.
* */
interface OnProductClickListener {

    fun onProductSelected(product : Product)
}