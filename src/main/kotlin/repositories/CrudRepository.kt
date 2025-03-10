package org.example.repositories

interface CrudRepository<T, ID> {

    fun save(item: T): T                    // C
    fun findAll(): List<T>                  // R
    fun findById(id: ID): T?                // R
    fun update(id: ID, item: T): T?         // U
    fun delete(id: ID): T?                  // D

}