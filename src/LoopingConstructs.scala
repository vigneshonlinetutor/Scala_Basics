/*
1. `while` Loop:
    - Repeats a block of code while a given condition is `true`.

2. `for` Loop:
    - Iterates over a range, a collection, or any sequence of values.

3. `foreach` Method:
    - A concise way to iterate over elements of a collection.
 */

@main def runLoopingConstructsExample(): Unit = {

  // WHILE LOOP
  var x: Int = 0
  while(x<5){
    println(s"The value of X currently is ${x}")
    x = x+1 // x += 1
  }

  println("=====================================")

  // FOR LOOP
  for(k <- 1 to 5){
    println(s"Value of k is ${k}")
  }

  val nums = List(1,2,3,4,5)
  val squares = for n <- nums yield n*n
  println(squares)

  for n <- nums do
    println(n*n)

  println("=====================================")

  // FOR-EACH LOOP
  val fruits = List("Apple", "Banana", "Grapes")

  fruits.foreach(fruit => println(s"Fruit name is ${fruit}"))

  for _ <- fruits do
    println(_)

}