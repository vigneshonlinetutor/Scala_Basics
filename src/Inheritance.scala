// Base Class - Parent Class
class Animal(name: String){
  def makeSound(): String = "Some Generic Animal Sound"
}

// Single Inheritance
class Dog(name: String, breed: String) extends Animal2(name){
  override def makeSound(): String = "Dog says woof woof"

  def displayBreed(): Unit = {
    println(s"$name is of $breed breed")
  }
}

trait Colorful {
  // Abstract Method
  def getColor(): String
}

class Cat(name: String, color: String) extends Animal2(name) with Colorful{
  override def makeSound(): String = "Cat says meow meow"

  def getColor(): String = color

  def displayColor(): Unit = {
    println(s"$name is of $color Colour")
  }
}

@main def runInheritanceExample(): Unit = {
val dogObj = new Dog("Buddy", "Labrador")
val catObj = new Cat("Lucy", "White")

  println(dogObj.makeSound())
  dogObj.displayBreed()

  println(catObj.makeSound())
  catObj.displayColor()
}