/*
Different Ways to Implement Encapsulation in Scala:

1. Private Fields and Methods:
- Marking fields and methods as `private` ensures they are only accessible within the class.

2. Getters and Setters:
- Use public methods (getters and setters) to access and modify private fields.

3. Case Classes:
- Case classes automatically generate getters for their fields and provide a concise way to define
immutable data structures.
 */

class BankAccount(private var balance: Double, private val accountNumber: String){
  // Getter for accountNumber
  def getAccountNumber: String = accountNumber

  // Public method to get balance
  def getBalance: Double = balance

  // Public method to deposit money
  def deposit(amount: Double): Unit = {
    if(amount>0){
      balance+= amount
      println(s"Deposited of amount $amount, New Balance is $balance")
    }
    else{
      println("Invalid deposit amount")
    }
  }

  def withdraw(amount: Double): Unit = {
    if(amount >0 && amount<= balance){
      balance-= amount
      println(s"Withdrawn an amount of $amount. New balance is $balance")
    }
    else {
      println("Invalid withdraw amount")
    }
  }
}

case class Personal(name: String, age:Int)


@main def runEncapsulationExample(): Unit = {
  // Using private field and Methods
  val account = new BankAccount(1000.0, "1234567890")

  // Access the public methods
  println(s"Account Number is : ${account.getAccountNumber}")
  println(s"Initial Balance is : ${account.getBalance}")

  account.deposit(1000.0)
  account.withdraw(200.0)

  println(s"Updated Balance is : ${account.getBalance}")

  val personObjNew = Personal("Vignesh",25)
  println(s"Person Details : $personObjNew")
}
