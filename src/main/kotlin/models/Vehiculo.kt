package org.example.models

import java.time.LocalDate

data class Vehiculo(

    val id: Int = NEW_ID,
    val matricula: String,
    val marca: String,
    val modelo: String,
    val fechaNacimiento: LocalDate,
    val permisoActivo: Boolean,
    val tipo: Tipo

) {
    companion object {

        const val NEW_ID = -1
        private var nextId = 1

        fun getNextId(): Int {
            return nextId++
        }
    }
}

enum class Tipo {
    ELECTRICO, HIBRIDO, COMBUSTION
}
