/*
1. Declaration:
    - An object is defined using the `object` keyword.

2. Singleton Instance:
    - Objects are single instances that are automatically created when the class is loaded.

3. Companion Objects:
    - An object with the same name as a class is called a companion object.
    - It can access private members of the class.
 */

class Counter(private var count: Int){

  // Method
  def increment(): Unit = {
    count += 1
  }

  def currentCount: Int = count
}

// Companion Object
object Counter{
  def apply(initialCount: Int): Counter = new Counter(initialCount)
}

object MathsOperations{
  def add(x: Int, y: Int): Int = x + y

  val pi: Double = 3.14159
}


@main def runObjectExample(): Unit = {

  val sum = MathsOperations.add(3,5)
  println(s"Sum value is $sum")

  val piValue = MathsOperations.pi
  println(s"PI value is $piValue")

  val counterObject = Counter(10)
  println(s"Initial Count: ${counterObject.currentCount}")

  counterObject.increment()
  println(s"Updated Count: ${counterObject.currentCount}")
}