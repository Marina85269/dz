package com.example.animal.start
import com.example.animal.model.Сarnivores
import com.example.animal.model.Herbivorous
import kotlinx.coroutines.awaitAll
import kotlin.reflect.full.memberProperties


fun main (){
    val arrayHerbivorousAnimal:MutableList<Herbivorous> = mutableListOf()
    val arrayPredatorAnimals:MutableList<Сarnivores> = mutableListOf(Сarnivores("crocodile", weight=60.4, speed=30.7f),  Сarnivores("tiger", weight=25.4, speed=50.7f ))

    var horse = Herbivorous("wild horse", "Mongolia Kazakhstan, China and Russia")
    var elephan = Herbivorous("elephant", "in the forests of East Asia and Africa, in the savannas")

    arrayHerbivorousAnimal.add(horse)
    arrayHerbivorousAnimal.add(elephan)

    arrayHerbivorousAnimal.forEach { println(it.view + " usually living " + it.range) }
    arrayPredatorAnimals.forEach{println(it.info(it.view))}

}