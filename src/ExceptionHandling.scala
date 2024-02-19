/*
Different Exception Handling in Scala:

a. Arithmetic Exception:
- Raised when an arithmetic operation is performed with incorrect inputs.

b. Null Pointer Exception:
- Raised when trying to access members (methods or fields) of a null object.

c. ArrayIndexOutOfBoundsException:
- Raised when trying to access an array element with an index that is out of bounds.

d. Exception (General):
- A catch-all for exceptions that do not fall into specific categories.
 */

@main def runExceptionHandling(): Unit = {

  // ARITHMETIC EXCEPTION
  try{
    val results = 10 / 0
    println(s"Result is $results")
  }
  catch{
    case e: ArithmeticException =>
      println(s"Arithmetic Exception: ${e.getMessage}")
  }

  // NULL POINTER EXCEPTION
  try {
    val str: String = null
    println(s"Length of string: ${str.length}")
  } catch {
    case e: NullPointerException =>
      println(s"NullPointerException: ${e.getMessage}")
  }

  // ARRAYINDEXOUTOFBOUND EXCEPTION
  try {
    val array = Array(1, 2, 3)
    println(s"Element at index 5: ${array(5)}")
  } catch {
    case e: ArrayIndexOutOfBoundsException =>
      println(s"ArrayIndexOutOfBoundsException: ${e.getMessage}")
  }

  // EXCEPTION
  try {
    throw new RuntimeException("Custom exception")
  } catch {
    case e: Exception =>
      println(s"Generic Exception: ${e.getMessage}")
  } finally {
    println("Finally Block Executed")
  }
}