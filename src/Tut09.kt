// Topic: Encapsulation in Kotlin using Getters, Setters, and Lateinit
    // just tip of the ice burg we will cover it in our OOP section
fun main() {
    // Understanding how to use getters and setters in Kotlin.

    // Creating an instance of the TutOnLate class
    val subject1 = TutOnLate("John", 'M', 23)
    subject1.lName = "Charter" // Setting the last name using the setter
    subject1.display() // Displaying the user's information
}

// Class representing a User with first name, last name, and age
class Users(firstName: String, var lastName: String, var age: Int) {
    // First name property with a backing field (not using a getter here)
    var firstName = firstName
}

// Example usage of Lateinit for properties that will be initialized later
class TutOnLate(var fName: String, var sex: Char, var age: Int) {
    // Lateinit property declaration. This will be initialized later.
    lateinit var lName: String // Note: Cannot use lateinit with primitive types (Int, Double, etc.)

    // Function to display the user's information
    fun display() {
        // Using the late-initialized variable lName
        if (::lName.isInitialized) { // Check if lName has been initialized
            println("Name: $fName $lName Sex: $sex Age: $age")
        } else {
            println("Name: $fName Not Set Sex: $sex Age: $age")
        }
    }
}

// Key Concepts Explained:
// 1. **Encapsulation**: Encapsulation is an OOP principle that restricts direct access to some of an object's components.
//    - In this example, we demonstrate encapsulation through the use of properties and how they are initialized.
//
// 2. **Getters and Setters**:
//    - In Kotlin, properties have default getters and setters. You can provide custom ones if needed.
//    - Here, although we don't show explicit getters and setters for `firstName` in the User class, you can add custom ones as required.
//
// 3. **Lateinit**:
//    - The `lateinit` modifier is used to declare a non-nullable property that will be initialized at a later point in time.
//    - It's commonly used for dependency injection or when the property cannot be initialized in the constructor.
//    - Note: `lateinit` cannot be used with primitive types (Int, Double, Char, etc.).
//
// 4. **Initialization Check**:
//    - Before accessing the late-initialized property `lName`, we check if it has been initialized using `::lName.isInitialized` to prevent exceptions.

// explore more by yourself links:
// https://www.w3schools.com/kotlin/index.php
// https://youtu.be/EExSSotojVI?feature=shared
// https://www.geeksforgeeks.org/kotlin-programming-language/?ref=shm