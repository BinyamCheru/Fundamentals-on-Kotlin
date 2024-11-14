// Handling Null Values in Kotlin
// In Kotlin, you must declare whether a variable can hold a null value. Regular types cannot hold null without special handling.

fun main() {
    // A nullable String variable can hold a null value. Declared with a question mark (?)
    var myString: String? = null // Correct: myString is nullable
    // var myString: String = null // ERROR: Cannot assign null to non-null type String

    // Another nullable String variable
    var other: String? = null // Initially set to null

    // Example of checking for null before using a property
    // Uncommenting the following line would cause a compilation error
    // println(other.length) // Not allowed: Cannot access length of a null variable

    // Checking if 'other' is not null before accessing its properties
    if (other != null) { // Check whether 'other' is not null
        println(other.length) // Safe to access length
    } else {
        println("The variable is null") // Handle the case where 'other' is null
    }

    // Optional Chaining: Easiest way to access properties of a nullable variable
    var other1: String? = "anything" // Initialized with a non-null value
    println(other1?.length) // Prints the length or 'null' if 'other1' is null

    // The assertion operator (!!): Throws an exception if the variable is null
    var other2: String? = "exception" // Initialized with a non-null value
    println(other2!!.length) // Will print the length. Be careful: it will throw NullPointerException if 'other2' is null

    // Elvis Operator (?:) for providing a default value when encountering null
    var other3: String? = null // Nullable variable
    // If other3 is not null, it assigns its value; otherwise, it assigns "The variable is null"
    var result: String = other3 ?: "The variable is null"
    println(result) // Outputs: "The variable is null"
}

// explore more by yourself links:
// https://www.w3schools.com/kotlin/index.php
// https://youtu.be/EExSSotojVI?feature=shared
// https://www.geeksforgeeks.org/kotlin-programming-language/?ref=shm