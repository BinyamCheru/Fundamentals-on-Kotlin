// Kotlin Basics Tutorial
// This program demonstrates variable declaration, data types, and some basic operations in Kotlin

fun main() {

    // Variable Declaration
    var something: String = "say something" // Mutable String variable
    println("Hello Kotlin, $something")

    var age: Int = 20 // Mutable Int variable
    println("Hello, you want to $something. Ok, I am $age years old.")

    // Type Inference: No need to specify the data type
    var name = "Binyam" // Inferred as String
    var number = 234 // Inferred as Int

    // Constant Declaration
    val constantVariable: String = "constant" // Immutable String variable
    // Uncommenting the next line will cause an error
    // constantVariable = "change";

    // Displaying Integer Limits
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    println("Int maximum value: $maxInt")
    println("Int minimum value: $minInt")

    // Displaying Byte Limits
    val maxByte: Byte = Byte.MAX_VALUE
    val minByte: Byte = Byte.MIN_VALUE
    println("Byte maximum value: $maxByte")
    println("Byte minimum value:  $minByte")

    // Displaying Short Limits
    val maxShort: Short = Short.MAX_VALUE
    val minShort: Short = Short.MIN_VALUE
    println("Short maximum value: $maxShort")
    println("Short minimum value:  $minShort")

    // Displaying Long Limits
    val maxLong: Long = Long.MAX_VALUE
    val minLong: Long = Long.MIN_VALUE
    println("Long maximum value: $maxLong")
    println("Long minimum value:  $minLong")

    // Demonstrating Float Data Type
    var myFloat = 2.5f // 'f' indicates Float type
    // Uncommenting the following line will cause an error
    // var myFloat: Float = 2.5 // Incorrect, as 2.5 is inferred as Double

    // Demonstrating Char and Boolean Data Types
    val myChar = 'B' // Character data type
    val myBool = false // Boolean data type

    println("My character: $myChar")
    println("My boolean value: $myBool")
}
// explore more by yourself links:
// https://www.w3schools.com/kotlin/index.php
// https://youtu.be/EExSSotojVI?feature=shared
// https://www.geeksforgeeks.org/kotlin-programming-language/?ref=shm