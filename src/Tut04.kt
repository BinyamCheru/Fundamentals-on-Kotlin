// Topic: Understanding Functions in Kotlin
    // This section is just tip of the ice burg we will cover Functions in separate section

fun main() {
    // Calling the function `sayHello` with parameters "Binyam" and 20
    sayHello("Binyam", 20)

    // Finding the maximum of two numbers using the `getMax` function
    var max = getMax(4, 9)
    println(max) // Outputs the maximum of 4 and 9

    // Calling the function `GetMax` (note the naming convention, ideally should start with a lowercase)
    max = GetMax(78, 39)
    println(max) // Outputs the maximum of 78 and 39

    // Calling a function with a default parameter
    default("Binyam")

    // Demonstrating a function that takes a variable number of arguments (vararg)
    println("The sum of many numbers using the vararg ${sumOfManyNumbers(4, 23, 34, 45, 134, 513, 53, 23, 45, 5)}")

    // Reminder: This is just the tip of the iceberg when it comes to functions.
    // We'll explore functions in greater depth in future sections.
}

// Function to greet a person with their name and age
fun sayHello(name: String, age: Int) { // Parameter types must be specified
    // Important: Parameters are immutable (like `val`), and you can't change their values.
    /* Uncommenting the line below will cause an error:
       age = 23; // ERROR: Val cannot be reassigned
    */
    var num = age // You can create a new variable to modify
    num = 21 // This is allowed because `num` is mutable

    // Printing a greeting message
    println("Hello I'm $name, and I'm $num years old.")
}

// Function to return the maximum of two integers
fun getMax(a: Int, b: Int): Int {
    // Using a conditional expression to determine the maximum
    var max = if (a > b) a else b
    println("some text before return statement")
    return max // Returning the maximum value
    // Note: Any code after a return statement is unreachable and won't be executed
}

// A concise version of the `getMax` function using a single expression
fun GetMax(a: Int, b: Int): Int = if (a > b) a else b // No return statement needed in this format

// Function with a default parameter
fun default(name: String, message: String = sendText()) {
    println("Name: $name and the message is: $message")
}

// Function that returns a default message
fun sendText(): String {
    return "Some text message" // This can also be written as: fun sendText() = "Some text message"
}

// Function that accepts a variable number of integer arguments (vararg)
fun sumOfManyNumbers(vararg numbers: Int): Int { // 'vararg' allows passing multiple arguments
    var result = 0
    // Summing all the numbers passed to the function
    for (num in numbers) {
        result += num
    }
    return result // Returning the sum
}

// explore more by yourself links:
// https://www.w3schools.com/kotlin/index.php
// https://youtu.be/EExSSotojVI?feature=shared
// https://www.geeksforgeeks.org/kotlin-programming-language/?ref=shm