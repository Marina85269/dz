package com.example.animal.model

class Herbivorous(view:String, tail:Boolean = true, limbs:Int = 4, weight: Double, speed: Float,  var eat:String = "grass"): Animal(view, tail, limbs,weight, speed) {
    fun b():String {
        return "$view травоядный."

}}