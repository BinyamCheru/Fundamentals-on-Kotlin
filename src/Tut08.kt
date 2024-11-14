// Topic: Initializer Block and Secondary Constructors in Kotlin  

fun main(args: Array<String>) {
    // Creating two User objects using the primary constructor  
    val user1 = User("Binyam", "Cheru", 20)
    val user2 = User("Alex", "Johnathan", 23)

    // Printing the names of the users  
    println("Name: ${user1.firstName} ${user1.lastName}")
    println("Name: ${user2.firstName} ${user2.lastName}")

    println()

    // Creating Registor objects, demonstrating the use of secondary constructors  
    val registor1 = Registor("Johny") // Using the constructor that takes only the name  
    val registor2 = Registor("English", 35) // Using the constructor that takes name and age  

    // Printing the values including defaults for Registor  
    println("For Registor 1: ${registor1.name} ${registor1.age} ${registor1.sex} ${registor1.height}")
    println("For Registor 2: ${registor2.name} ${registor2.age} ${registor2.sex} ${registor2.height}")

    // Creating a Start object with all parameters specified  
    println()
    val me = Start("Binyam", "23/53/12", "Tuesday", 20)
    me.display()

    // Creating a Start object by passing only selected parameters (using named arguments)  
    val me1 = Start(age = 34, date = "23/53/12") // Other parameters will take default values
    me1.display()
}

// Class representing a user with a name and age  
class User(firstName: String, var lastName: String, var age: Int) {
    var firstName: String

    // Initializer block for additional validation of the firstName property  
    init {
        if (firstName.lowercase().startsWith(prefix = "a")) {
            this.firstName = firstName // Referring to the constructor parameter  
        } else {
            this.firstName = "User" // Defaulting to "User" if the condition is not met  
            println("The name doesn't start with 'a' or 'A'")
        }
    }
}

// Class representing a registor with name, age, sex, and height  
class Registor(var name: String, var age: Int = 0, var sex: Char = 'T', var height: Double = 1.5) {
    // Secondary constructor: when only the name is provided, default values are used  
    constructor(name: String) : this(name, 0, 'T', 1.5) {
        println("2nd constructor is called")
    }

    // Secondary constructor: when name and age are provided, defaults for sex and height  
    constructor(name: String, age: Int) : this(name, age, 'T', 1.7) {
        println("3rd constructor is called")
    }
}

// Class representing a worker with default parameter values  
class Start(var name: String = "someone", var date: String = "00/00/00", var day: String = "Monday", var age: Int) {
    // Method to display information about the worker  
    fun display() {
        println("Hi, I am $name and I'm $age. I started working here on $date and today is $day.")
    }
}

// Important Concepts Explained:  
// 1. **Primary Constructor**:   
//    - The simplest way to initialize a class. The primary constructor can also have default values, as shown in the Start class.  
//  
// 2. **Secondary Constructors**:   
//    - These provide additional ways to create class instances. In Registor, we demonstrate how to call the primary constructor with different sets of parameters.  
//    
// 3. **Initializer Block**:   
//    - The `init` block allows additional initialization logic after the primary constructor has completed.   
//    In User, it ensures that the firstName meets certain criteria.  
//  
// 4. **Default Parameters**:   
//    - Allow you to specify default values for constructor parameters. This makes instantiation flexible, as shown in the Start class.  
//  
// 5. **Named Arguments**:   
//    - You can specify which parameters you are providing values for, making it clearer especially when many parameters are present.  
//  
// 6. **Character Initialization**:   
//    - Using a default character for the `sex` property in the Registor class and ensuring ease of use when creating objects.  
//  
// 7. **Member Properties**:   
//    - Declared in the primary constructor can be used directly in the class. Enhanced by setting defaults without requiring additional constructors.  
//  
// 8. **Variable Declaration**:   
//    - Using `val` or `var` signifies whether the properties are immutable or mutable, respectively. In this case, using `var` indicates these properties can change after initialization.

// explore more by yourself links:
// https://www.w3schools.com/kotlin/index.php
// https://youtu.be/EExSSotojVI?feature=shared
// https://www.geeksforgeeks.org/kotlin-programming-language/?ref=shm