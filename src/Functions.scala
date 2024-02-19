/*
### Types of Functions in Scala:

1. Standalone Functions:
    - Independent functions defined outside of any object or class.

2. Methods:
    - Functions associated with objects or classes.

3. Anonymous Functions (Lambdas):
    - Functions without a name, often used for concise expressions.

4. Higher-Order Functions:
    - Functions that take other functions as parameters or return functions.

5. Curried Functions:
    - Functions that take multiple parameter lists.
 */

@main def runFunctionsExample(): Unit = {

  // STANDALONE FUNCTION
  def add(x: Int, y: Int): Int = {
    x+y
  }

  val result = add(3,5)
  println(s"Result output is ${result}")

  println("==============================================")

  // METHOD
  object Calculator {
    def multiply(x: Int, y: Int): Int = {
      x*y
    }
  }

  class Calculator2{
    def division(x: Int, y: Int): Int = {
      x/y
    }
  }

  val result1 = Calculator.multiply(3,5)
  val calculator2 = new Calculator2()
  val result2 = calculator2.division(9,3)

  println(s"Value of Multiply is : ${result1}")
  println(s"Value of Division is : ${result2}")

  println("==============================================")

  // ANONYMOUS FUNCTION
  val square: Int => Int = (x: Int) => x * x
  val anonymousResult = square(10)
  println(s"Square Result is ${anonymousResult}")

  println("==============================================")

  // HIGHER ORDER FUNCTION
  def operate(x: Int, y: Int, higher:(Int, Int) => Int): Int = {
    higher(x,y)
  }

  val higherResult = operate(3,4,(a,b) => a+b)
  val higherResult2 = operate(5,10,(a,b) => a*b)
  println(s"Higher Order Result is ${higherResult}")
  println(s"Higher Order Result is ${higherResult2}")

  println("==============================================")

    // CURRIED FUNCTION
  def addCurried(x:Int)(y:Int): Int = {
    x+y
  }
  val curriedResult1 = addCurried(3)
  val curriedFinalResult = curriedResult1(4)
  println(s"Add Curried Result ${curriedFinalResult}")

}