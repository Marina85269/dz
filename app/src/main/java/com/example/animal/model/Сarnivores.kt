package com.example.animal.model

class Сarnivores(view:String, var weight: Double, var speed: Float): Animal(view) {

 open  fun info(view:String): String{
   return "$view weighs $weight a kilogram and run at speed: $speed"
   }
 }

