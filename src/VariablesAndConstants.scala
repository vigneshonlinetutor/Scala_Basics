/*
1. Variables (`var`):
    - Variables are used to store mutable data, i.e., values that can be reassigned.
    - Declared using the `var` keyword.

2. Constants (`val`):
    - Constants are used to store immutable data, i.e., values that cannot be reassigned.
    - Declared using the `val` keyword.

 */
@main def runVariablesAndConstantsExample(): Unit = {

  //  MUTABLE VAR - VARIABLE
  var myAge: Int = 25
  println(s"My age is: ${myAge}")

  myAge = 30
  println(s"My age is: ${myAge}")


  // IMMUTABLE VAL - CONSTANT
  val myName: String = "Vignesh"
  println(s"My Name is: ${myName}")

//  myName = "Ganesh"

}