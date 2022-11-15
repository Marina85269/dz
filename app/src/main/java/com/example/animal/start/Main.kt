package com.example.animal.start
import com.example.animal.model.Animal
import com.example.animal.model.Сarnivores
import com.example.animal.model.Herbivorous
import kotlinx.coroutines.joinAll
import java.util.Objects

fun main (){
    val arrayAnimal:MutableList<Herbivorous> = mutableListOf(Herbivorous("horse", weight=45.1, speed = 20.2f),
        Herbivorous("elephant", weight=700.1, speed=58.7f))

    val arrayAnimal2:MutableList<Сarnivores> = mutableListOf(Сarnivores("crocodile", weight=60.4, speed=30.7f),
    Сarnivores("tiger", weight=25.4, speed=50.7f ))

//    var tiger = Сarnivores("tiger", true, 4, weight=25.4,speed=50.7f )
//    var horse = Herbivorous("horse",true, 4, 45.1,20.2f )
//    var crocodile = Сarnivores("crocodile", true, 4, weight=60.4,speed=30.7f )
//    var elephant = Herbivorous("elephant", true, 4, weight=700.1,speed=58.7f )
//    arrayAnimal.add(horse)
//    arrayAnimal.add(tiger)


    println(arrayAnimal)
    println(arrayAnimal2)


}