// Step 7: Class with primary constructor
class Person(val name: String, val age: Int) {

    // Step 8: Init block
    init {
        println("Welcome, $name! 🎉")
    }

    // Step 9: Function to display person’s info
    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    val person1 = Person("Sarika", 22)
    person1.displayInfo()

    val person2 = Person("Aarav", 19)
    person2.displayInfo()
}
