/*
1. Subtyping Polymorphism:
- Subtyping polymorphism, also known as subtype or inclusion polymorphism, allows objects of derived classes
to be used through a reference to their superclass.
- In Scala, subtyping polymorphism is achieved through class inheritance and method overriding

2. Parametric Polymorphism (Generics):
- Parametric polymorphism, also known as generic programming, allows the creation of classes and methods
that can operate on multiple types.
- It eliminates the need to duplicate code for different types by introducing type parameters
 */

class Animal2(name: String){
  def makeSound(): String = "Some Generic Animal Sound"
}

class Dog2(name: String, breed: String) extends Animal2(name){
  override def makeSound(): String = "Dog says woof woof"

  def displayBreed(): Unit = {
    println(s"$name is of $breed breed")
  }

  def displayBreed(value: Int): Unit = {
    println(s"$name is of $breed breed")
  }

  def displayBreed(value: Int, value2: Int): Unit = {
    println(s"$name is of $breed breed")
  }
}

class Box[T](value:T){
  def getValue: T = value
}


@main def runPolymorphismExample(): Unit = {
  val dogObj = new Dog2("Buddy", "Labrador")

  dogObj.displayBreed()
  dogObj.displayBreed(3)
  dogObj.displayBreed(3,3)

  val intBox = new Box(3)
  val stringBox = new Box("Vignesh")
  val charBox = new Box('V')

  println(intBox.getValue)
  println(stringBox.getValue)
  println(charBox.getValue)
}