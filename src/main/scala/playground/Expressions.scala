package playground

object Expressions extends App {

  val x = 1 + 2   // Expression
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3    // also works with -= *= /= ... side effects
  println(aVariable)

  // Instruction (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3   // IF Expression
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  // NEVER WRITE THIS
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3)   // Unit
  println(aWeirdValue)

  // Code Blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. Difference between "hello world" vs println("hello world")?

  val someValue = {
    2 < 3
  }
  println(someValue)

  val somOtherValue = {
    if(someValue) 239 else 986
    42
  }
}
