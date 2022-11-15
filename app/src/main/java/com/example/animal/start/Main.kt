package com.example.animal.start
import com.example.animal.model.Сarnivores
import com.example.animal.model.Herbivorous


fun main (){
    val arrayAnimal:MutableList<Herbivorous> = mutableListOf(Herbivorous("wild horse", range = "Mongolia, Kazakhstan, China and Russia"),
        Herbivorous("elephant", range = "in the forests of East Asia and Africa, in the savannas"))

    val arrayAnimal2:MutableList<Сarnivores> = mutableListOf(Сarnivores("crocodile", weight=60.4, speed=30.7f),
    Сarnivores("tiger", weight=25.4, speed=50.7f ))

    println(arrayAnimal)
    println(arrayAnimal2)




}