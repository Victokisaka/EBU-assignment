fun main() {
    // Declare some variables
    val myString: String = "Hello, World!"
    var myNumber: Int = 42
    var myDouble: Double = 3.14

    // Perform some mathematical operations
    myNumber += 8
    myDouble /= 2.0

    // Use logical operators and if-else conditions
    if (myNumber > 50 && myDouble < 2.0) {
        println("Both conditions are true")
    } else if (myNumber > 50 || myDouble < 2.0) {
        println("At least one condition is true")
    } else {
        println("Neither condition is true")
    }

    // Use a when case statement to check the type of a variable
    when (myString) {
        is String -> println("myString is a String")
        else -> println("myString is not a String")
    }

    // Call a function with parameters
    val sum = addNumbers(4, 5)
    println("The sum is $sum")
}

// Define a function that takes two parameters and returns their sum
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}
