// Topic: Arrays in Kotlin

fun main() {
    // Declaring and initializing arrays
    val names = arrayOf("John", "Sam", "Tom Cruise") // Array of Strings
    val numbers = arrayOf(12, 32, 53, 23, 3) // Array of Integers
    val mixed = arrayOf(1, 3, 2, "some string", "cool", 'C', 'S') // Array with mixed types

    // Getting the size of an array
    println("The size of the names array: ${names.size}") // Outputs the number of elements in the 'names' array

    // Iterating over the 'names' array
    println("Names:")
    for (name in names) {
        println(name) // Print each name
    }

    // Iterating over the 'mixed' array
    println("Mixed array contents:")
    for (item in mixed) {
        println(item) // Print each item in the mixed array
    }

    println() // Print an empty line for separation

    // Printing only specific data types (Integers) in a mixed array
    println("Integers from mixed array:")
    for (n in mixed) {
        if (n is Int) { // Check if 'n' is of type Int
            println(n) // Print the integer
        }
    }

    // Challenge: Function to return the largest number from an Integer array
    fun largest(arr: Array<Int>): Int {
        var large = arr[0] // Initialize with the first element
        for (i in 1 until arr.size) { // Iterate from the second element to the end
            if (arr[i] > large) { // Compare and find the largest
                large = arr[i]
            }
        }
        return large // Return the largest number found
    }

    // Function to return the smallest number from an Integer array
    fun smallest(arr: Array<Int>): Int {
        var small = arr[0] // Initialize with the first element
        for (i in 1 until arr.size) { // Iterate from the second element to the end
            if (arr[i] < small) { // Compare and find the smallest
                small = arr[i]
            }
        }
        return small // Return the smallest number found
    }

    println() // Print an empty line for separation

    // Creating an integer array for testing the functions
    val array = arrayOf(2, 32, 52, 432, 13) // Test array

    // Calling the functions to find largest and smallest numbers
    val large = largest(array)
    val small = smallest(array)
    // Displaying the results
    println("The largest number is $large and the smallest number is $small")
}

// Important Concepts Explained:
// 1. **Arrays**: Kotlin arrays are fixed-size and can hold elements of the same type.
//    They are created using the `arrayOf()` function. The size is defined at the time of creation and cannot be changed afterward.

// 2. **Size of Array**: Use `array.size` to get the number of elements in the array.

// 3. **Iteration**: You can iterate through the elements of an array using a for loop.

// 4. **Type Checking**: The `is` operator is used to check the type of an item. In the loop over the mixed array,
//    it's used to filter and print only integers.

// 5. **Functions**: Functions like `largest` and `smallest` demonstrate how to encapsulate reusable logic that operates on arrays.

// 6. **Return Values**: Functions return values using the `return` keyword, which can then be stored in variables.
//    This promotes code reusability and clarity.

// explore more by yourself links:
// https://www.w3schools.com/kotlin/index.php
// https://youtu.be/EExSSotojVI?feature=shared
// https://www.geeksforgeeks.org/kotlin-programming-language/?ref=shm