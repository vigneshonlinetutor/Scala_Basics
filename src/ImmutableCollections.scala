/*
Different Immutable Collections in Scala:

a. List:
- An ordered collection of elements.
- Example: `List(1, 2, 3, 4, 4)`

b. Set:
- A collection of unique elements with no defined order.
- Example: `Set("apple", "banana", "orange")`

c. Map:
- A collection of key-value pairs.
- Example: `Map("one" -> 1, "two" -> 2, "three" -> 3)`

d. Vector:
- An ordered collection of elements, similar to `List`.
- Example: `Vector(4, 5, 6)`

e. Tuple:
- An ordered collection of elements of different types.
- Example: `(1, "apple", true)`
 */

@main def runImmutableCollectionExample(): Unit = {

  val list: List[Int] = List(1,2,3,4)
  val list2: List[String] = List("Vignesh", "Scala")

  val set: Set[Int] = Set(1,2,3,4,4)
  val set2: Set[String] = Set("Apple", "Banana", "Grape", "Apple")

  val map:Map[String, Int]= Map("One"->1, "Two"->2)

  val vector:Vector[Int] = Vector(1,2,3,4,5,1,2)

  val tuple = (1,"Vignesh", true, 'A')

  println(s"List values are $list")
  println(s"List values are $list2")

  println(s"Set values are $set")
  println(s"Set values are $set2")

  println(s"Map values are $map")

  println(s"Vector values are $vector")

  println(s"Tuple values are $tuple")
}