import scala.collection.mutable
import scala.collection.mutable.*

/*
Different Mutable Collections in Scala:

a. ArrayBuffer:
- A mutable sequence backed by an array.
- Example: `ArrayBuffer(1, 2, 3)`

b. ListBuffer:
- A mutable list for efficient addition of elements.
- Example: `ListBuffer("apple", "banana", "orange")`

c. HashSet:
- A mutable set allowing fast membership tests.
- Example: `HashSet(1, 2, 3)`

d. HashMap:
- A mutable map with key-value pairs.
- Example: `HashMap("one" -> 1, "two" -> 2, "three" -> 3)`

e. MutableList:
- A mutable linked list.
- Example: `MutableList(4, 5, 6)`
 */

@main def runMutableCollectionExample(): Unit = {
val arrayBuffer: ArrayBuffer[Int] = ArrayBuffer(1,2,3)
val listBuffer: ListBuffer[String] = ListBuffer("Apple", "Banana", "Grapes")
val hashSet:HashSet[Int] = HashSet(1,2,3,1,2)
val hashMap:HashMap[String, Int] = HashMap("One"->1, "Two"->2)

  println(s"Mutable ArrayBuffer: $arrayBuffer")
  println(s"Mutable ListBuffer: $listBuffer")
  println(s"Mutable HashSet: $hashSet")
  println(s"Mutable HashMap: $hashMap")

  arrayBuffer+=4
  listBuffer += "Mango"
  hashSet.add(5)
  hashSet.add(6)
  hashMap.put("Three",3)

  println("=============================================")

  println(s"Mutable ArrayBuffer: $arrayBuffer")
  println(s"Mutable ListBuffer: $listBuffer")
  println(s"Mutable HashSet: $hashSet")
  println(s"Mutable HashMap: $hashMap")

}