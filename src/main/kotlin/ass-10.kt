class One(val name: String, val age: Int) {

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
    // Create objects of class One
    val person1 = One("Sarika", 22)
    person1.displayInfo()

    val person2 = One("Aarav", 19)
    person2.displayInfo()
}
