// Operators and Conditional Statements Tutorial
// This program demonstrates the use of various operators and conditional statements in Kotlin

fun main() {
    // Variable Declaration
    var x = 5f // Mutable variable of type Float
    val y = 7 // Immutable variable of type Int

    // Basic Arithmetic Operations
    println("x + y = ${x + y}")  // Using string interpolation
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}") // Modulus operation

    // Example of combining arithmetic operations
    println("test = ${8 + 6 + x}")

    // Compound Assignment Operators
    x -= 2 // Equivalent to x = x - 2
    println("Updated x = $x")
    x *= 10 // Equivalent to x = x * 10
    println("Updated x = $x")
    x %= 3 // Equivalent to x = x % 3
    println("Updated x = $x")

    // Increment and Decrement Operations
    println("Pre-increment of x = ${++x}") // Increment then use the updated value
    println("Post-increment of x = ${x++}") // Use the current value then increment
    println("Pre-decrement of x = ${--x}") // Decrement then use the updated value
    println("Post-decrement of x = ${x--}") // Use the current value then decrement
    println("The final value of x = $x") // Final value after all operations

    // Conditional Statements
    val isPlaying = true // Boolean variable
    val score = 80 // Integer variable

    // Simple if-else statement
    if (isPlaying && score >= 100) {
        println("Go to Next level") // Executes if both conditions are true
    } else {
        println("Still at the same level") // Executes if any condition is false
    }

    // Assigning a value using an if expression
    val n1 = 5 // Sample value
    val n2 = 2 // Sample value
    val test = if (n1 > 0 && n2 < 0) {
        println("One of the numbers is negative")
        "The if executed" // Result if the condition is true
    } else {
        println("They have the same sign")
        0 // Result if the condition is false (different data type but allowed)
    }
    println(test) // Output the result of the if expression

    // The when statement (similar to switch-case)
    var alarm = 1 // Sample alarm setting
    when (alarm) {
        12 -> println("The alarm is $alarm") // Case for exact match
        in 1..5 -> println("The alarm is between 1 and 5") // Range check
        !in 5..10 -> println("The alarm is not in [5,10]") // Negation of a range
        13, 14, 15 -> println("The alarm is 13, 14 or 15") // Multiple cases
        else -> println("This is the default case (like 'default' in switch)")
    }

    // Using when without an argument
    when {
        alarm > 10 -> println("I guess it is in the morning")
        alarm == 8 -> println("Time to go to school")
        alarm in 1..5 -> println("Some case here")
        alarm == 5 || alarm == 10 -> println("Bring me something to eat")
        else -> println("This is the default condition")
    }

    // Assigning the last expression of when to a variable
    var text = when {
        alarm == 0 -> "There is no such thing" // Case for alarm = 0
        alarm > 24 -> "A day is only 24 hours" // Case for invalid hour value
        else -> "The default case" // Default case
    }
    println(text) // Output the result of the when expression
}

// explore more by yourself links:
// https://www.w3schools.com/kotlin/index.php
// https://youtu.be/EExSSotojVI?feature=shared
// https://www.geeksforgeeks.org/kotlin-programming-language/?ref=shm