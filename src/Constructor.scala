/*
1. Primary Constructor:
    - The primary constructor is declared in the class signature.
    - Parameters of the primary constructor are used to initialize the fields.
2. Secondary Constructors:
    - Secondary constructors are defined using the `this` keyword.
    - Additional constructors can be used to provide flexibility in object creation.
 */

// PRIMARY CONSTRUCTORS
class PersonNew(name: String, age:Int) {

  // Fields
  val fullName: String = s"${name} (Age: $age)"

  // Method
  def greet(): Unit = {
    println(s"Hello, my name is $name and I am $age years old")
  }

}

// SECONDARY CONSTRUCTOR
class PersonWithDefaultAge(name: String, age: Int = 25){

  def this(name: String) = this(name, 25)

  val fullName: String = s"${name} (Age: $age)"
}

@main def runConstructorExample(): Unit = {

  val personNewObject = new PersonNew("Alice", 35)
  val personNewObject2 = new PersonNew("Bob", 55)

  println(personNewObject.fullName)
  personNewObject2.greet()

  val personDefaultAgeObject = new PersonWithDefaultAge("David", 60)
  val personDefaultAgeObject2 = new PersonWithDefaultAge("Charlie")

  println(personDefaultAgeObject.fullName)
  println(personDefaultAgeObject2.fullName)
}