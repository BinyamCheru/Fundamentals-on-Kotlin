// Topic: Object-Oriented Programming (OOP) in Kotlin  
        // This section is just tip of the ice burg we will cover OOP in separate section
fun main() {
    // Creating an object of the Cars class using a default constructor  
    val car1 = Car() // Assuming 'Car' is defined in some other part of the code  
    car1.name = "Tesla"
    car1.model = "S Plaid"
    car1.color = "Red"
    car1.doors = 4

    // Printing the properties of the first car object to the console  
    println("\nCar 1 Details:")
    println("Car name: ${car1.name}")
    println("Car model: ${car1.model}")
    println("Car color: ${car1.color}")
    println("Car doors: ${car1.doors}")
    car1.move() // Calling the move function  
    car1.stop() // Calling the stop function  

    // Creating an object of the Cars class with a primary constructor  
    val car2 = Cars("Tesla", "S Plaid", "Red", 4)

    // Printing the properties of the second car object to the console  
    println("\nCar 2 Details:")
    println("Car name: ${car2.name}")
    println("Car model: ${car2.model}")
    println("Car color: ${car2.color}")
    println("Car doors: ${car2.doors}")
    car2.move() // Calling the move function  
    car2.stop() // Calling the stop function  

    // Creating an object of the Cars1 class using a data cleaning feature in the constructor  
    val car3 = Cars1("   Tesla    ", "S Plaid", "Red", 4)

    // Printing the properties of the third car object to the console  
    println("\nCar 3 Details:")
    println("Car name: ${car3.name}")
    println("Car model: ${car3.model}")
    println("Car color: ${car3.color}")
    println("Car doors: ${car3.doors}")
    car3.move() // Calling the move function  
    car3.stop() // Calling the stop function  

}

// Class definition for Cars  
// This class uses a primary constructor to initialize properties  
class Cars(var name: String, var model: String, var color: String, var doors: Int) {
    // Methods or functions related to the object  
    fun move() {
        println("The car is moving")
    }

    fun stop() {
        println("The car has stopped")
    }
}

// Class definition for Cars1, demonstrating property initialization and data cleaning  
class Cars1(name: String, var model: String, var color: String, var doors: Int) {
    // Trim the input name to remove surrounding whitespace before initialization  
    var name = name.trim()

    // Methods or functions related to the object  
    fun move() {
        println("The car is moving")
    }

    fun stop() {
        println("The car has stopped")
    }
}

class Car {
    var name = "" // it must be initialized
    var model = ""
    var color = ""
    var doors = 0

    fun move(){
        println("The car is moving")
    }

    fun stop()
    {
        println("The car has stopped")
    }

}

// Important Concepts Explained:  
// 1. **Object-Oriented Programming (OOP)**: OOP is a programming paradigm based on the concept of "objects",   
//    which can contain data and code that manipulates that data. It enables code reuse and modularity.  

// 2. **Classes and Objects**:   
//    - A class serves as a blueprint for creating objects (instances of the class).  
//    - An object is an instance of a class that contains properties and behaviors (methods) defined by the class.  
//   
// 3. **Constructors**:  
//    - The primary constructor allows you to initialize object properties directly at the time of object creation.  
//    - In Cars1, we demonstrate how to modify data during initialization (trimming the name).  
//   
// 4. **Property Declaration**:  
//    - Using `var` before property names declared in the primary constructor allows these properties to be mutable.  
//    - If you use `val`, the property is read-only and cannot be changed after initialization.  

// 5. **Methods**:  
//    - Functions defined within a class, which define behaviors associated with the objects of that class.   
//    - For example, `move()` and `stop()` methods demonstrate what a `Car` can do.  

// 6. **Access Modifiers**:  
//    - By default, properties and methods in a Kotlin class are `public`. You can restrict access using `private` or `protected`.  

// 7. **String Manipulation**:  
//    - The `trim()` function in Cars1 is used to clean the input data, ensuring that excess whitespace does not affect object properties.  

// 8. **Encapsulation**:  
//    - Important OOP concept where the internal state of an object is protected from direct outside interference and misuse.   
//    In a more complex scenario, we could use `private` or `protected` access modifiers to manage access to properties.

// explore more by yourself links:
// https://www.w3schools.com/kotlin/index.php
// https://youtu.be/EExSSotojVI?feature=shared
// https://www.geeksforgeeks.org/kotlin-programming-language/?ref=shm