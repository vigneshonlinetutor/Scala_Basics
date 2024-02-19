class Person {

  // Instance Variables
  var name: String = ""
  var age: Int = 0

  // Method
  def sayHello(): Unit = {
    println(s"Hello, my name is ${name} and my age is ${age}")
  }
}
@main def runClassExample(): Unit = {
  val personObj = new Person()
  personObj.name = "Vignesh"
  personObj.age = 25
  personObj.sayHello()
}
