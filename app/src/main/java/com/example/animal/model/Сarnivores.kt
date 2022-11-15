package com.example.animal.model

class Сarnivores(view:String, tail:Boolean = true, limbs:Int = 4, weight: Double, speed: Float, var eat:String = "meat"): Animal(view, tail, limbs,weight, speed) {
 fun a ():String {
     return "$view плотоядный."
 }
   
}