/*
1. Numeric Types:
    - Integers: Represented by `Int` (32-bit) and `Long` (64-bit).
    - Floating-point Numbers: Represented by `Float` and `Double`.
2. Boolean Type:
    - Represented by `Boolean`, with values `true` or `false`.
3. Characters:
    - Represented by `Char`, holding a single Unicode character.
4. Strings:
    - Represented by `String`, holding a sequence of characters.
5. Reference Types:
    - AnyRef: The base type of all reference types.
    - Null: Represents the `null` reference.
6. Unit Type:
    - Represented by `Unit`, similar to `void` in other languages. It indicates no meaningful value.
7. Nothing Type:
    - Represents a value that never returns normally (e.g., a method that throws an exception).
 */

  @main def runDataTypes(): Unit = {

    // NUMERIC DATA TYPES
    val intValue: Int = 42
    val longValue: Long = 1234567890L
    val floatValue: Float = 3.1412f
    val doubleValue: Double = 2.133343
    println(s"Integer Value : ${intValue}")
    println(s"Long Value : ${longValue}")
    println(s"Float Value : ${floatValue}")
    println(s"double Value : ${doubleValue}")

    println("======================================================")

    //  BOOLEAN DATATYPE
    val trueValue: Boolean = true
    val falseValue: Boolean = false
    println(s"True Value : ${trueValue}")
    println(s"False Value : ${falseValue}")

    println("======================================================")

    // CHARACTER DATATYPE
    val charValue: Char = 'A'
    val charValue2: Char = '@'
    println(s"Char Value 1 : ${charValue}")
    println(s"Char Value 2 : ${charValue2}")

    println("======================================================")

    val stringValue: String = "I am Vignesh"
    val stringValue2: String = "Scala is very easy"
    println(s"String Value 1 : ${stringValue}")
    println(s"String Value 2 : ${stringValue2}")

    println("======================================================")

    // REFERENCE TYPES
    val str: String = "Hello Scala" // String is a subtype of AnyRef
    val objStr: AnyRef = str
    println(s"String Value : ${str}")
    println(s"Object to the String : ${objStr}")

    println("======================================================")

    val nullValue: Null = null
    val objWithNull: AnyRef = nullValue
    println(s"Null Value : ${nullValue}")
    println(s"Object to the Null : ${objWithNull}")

    println("======================================================")

    val unitValue: Unit = ()
    println(s"Unit Value: ${unitValue}")

    println("======================================================")

    def throwError(): Nothing = {
      throw new RuntimeException("This is an exception")
    }

    throwError()

  }