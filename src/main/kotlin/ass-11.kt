class Person(val name: String, val age: Int) {

    // Init block to print a welcome message
    init {
        println("Welcome, $name! 🎉")
    }

    // Function to display person's info
    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    // Create objects of Person
    val person1 = Person("Sarika", 22)
    person1.displayInfo()

    val person2 = Person("Aarav", 19)
    person2.displayInfo()
}
