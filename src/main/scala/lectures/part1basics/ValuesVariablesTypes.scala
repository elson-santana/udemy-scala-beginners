package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // Vals are immutable
  // Compiler can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 565412654981651654L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14


  // Variables
  var aVariable: Int = 4

  aVariable = 5 // Side effects

}
