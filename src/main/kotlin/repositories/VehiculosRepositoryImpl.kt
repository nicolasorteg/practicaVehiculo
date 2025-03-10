package org.example.repositories

import org.example.models.Vehiculo

class VehiculosRepositoryImpl: CrudRepository<Vehiculo, Int> {
    override fun save(item: Vehiculo): Vehiculo {
        TODO()
    }
    override fun findAll(): List<Vehiculo> {

        val vechiculos = mutableListOf<Vehiculo>()




    }
    override fun findById(id: Int): Vehiculo? {
        TODO()
    }
    override fun update(id: Int, item: Vehiculo): Vehiculo? {
        TODO()
    }
    override fun delete(id: Int): Vehiculo? {
        TODO()
    }
}