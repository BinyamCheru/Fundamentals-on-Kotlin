// Topic: Loops in Kotlin

fun main() {
    // The for loop
    // In Kotlin, the for loop is often used to iterate over a range of values.

    // Using the range operator: `..` creates a range from the starting number to the ending number, inclusive.
    println("Using the range operator: ..")
    for (i in 1..5) { // `in` operator is essential for the for loop.
        println("i = $i") // This will print numbers 1 to 5
    }

    // Using the `until` keyword
    println("Using the until keyword:")
    for (j in 1 until 5) { // `until` creates a range from 1 to 4 (5 is exclusive).
        println("j = $j") // This will print numbers 1 to 4
    }

    // Counting down with the `downTo` keyword
    println("To count down we use the downTo keyword:")
    for (i in 5 downTo 1) { // `downTo` creates a range from 5 down to 1, inclusive.
        println("i = $i") // This will print numbers 5 to 1
    }

    // Using `step` to specify the increment
    println("Escaping steps in our loop:")
    for (j in 1 until 10 step 2) { // Using `step` allows to skip numbers (e.g., counting by twos).
        println("j = $j") // This will print odd numbers between 1 and 9: 1, 3, 5, 7, 9
    }

    // The while loop
    // The while loop executes a block of code as long as a specified condition is true.
    println("Using while loop:")
    var count = 0
    while (count < 5) {
        println("Count is: $count")
        count++ // Incrementing count to avoid infinite loop
    }

    // The do-while loop guarantees execution of the loop at least once.
    println("Using do...while loop:")
    var number = 0
    do {
        println("Number is: $number")
        number++ // Increment until the condition is met
    } while (number < 5)

    // Breaking and continuing the loops
    // You can use `break` to exit the loop and `continue` to skip the current iteration.

    // Using labels with `break` and `continue`
    println("Using label or variable@ to terminate the outer loop:")
    var n = 0
    outer@ while (true) { // Label to mark the outer loop for breaking
        n++
        println("n = $n")
        for (i in 1..3) {
            if (n > 3) {
                break@outer // Exits the outer loop when n exceeds 3
            }
            println("i = $i") // This will execute while n <= 3
        }
    }

    // Printing a pattern using nested loops
    println("Printing a pattern:")
    for (i in 1..5) { // Outer loop controls the number of rows
        for (j in 1..i) { // Inner loop controls the number of stars printed on each line
            print(" *") // Print star with a space
        }
        print("\n") // Move to the next line after finishing one row
    }
}

// explore more by yourself links:
// https://www.w3schools.com/kotlin/index.php
// https://youtu.be/EExSSotojVI?feature=shared
// https://www.geeksforgeeks.org/kotlin-programming-language/?ref=shm