package org.sergei.scala

class Cat(name : String) extends Pet(name : String) with Chipped {
  var chipName = name
}
