// Step 2 & 3: Person class with primary constructor
class Person(val name: String, val age: Int) {

    // Step 4: Init block
    init {
        println("Welcome, $name! 🎉")
    }

    // Step 5: Function to display info
    fun displayInfo() {
        println("Person → Name: $name, Age: $age")
    }
}

// Step 6: Employee class
class Employee(val name: String, val employeeId: Int) {

    // Step 7: Secondary constructor with default employeeId
    constructor(name: String) : this(name, 0)

    // Step 8: Function to show details
    fun showDetails() {
        println("Employee → Name: $name, ID: $employeeId")
    }
}

// Step 9 & 10: Car class
class Car(val model: String) {

    var year: Int = 0

    // Step 11: Init block
    init {
        println("Car object created → Model: $model")
    }

    // Secondary constructor
    constructor(model: String, year: Int) : this(model) {
        this.year = year
    }

    fun showCarDetails() {
        println("Car → Model: $model, Year: $year")
    }
}

fun main() {
    // Step 12: Create and print details

    // One Person object
    val person = Person("Sarika", 22)
    person.displayInfo()

    // Two Employee objects
    val emp1 = Employee("Aarav", 101) // primary constructor
    val emp2 = Employee("Meera")      // secondary constructor
    emp1.showDetails()
    emp2.showDetails()

    // Two Car objects
    val car1 = Car("Tesla")           // primary constructor
    val car2 = Car("BMW", 2023)       // secondary constructor
    car1.showCarDetails()
    car2.showCarDetails()
}
