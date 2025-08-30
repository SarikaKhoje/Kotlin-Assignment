// Class Person1
class Person1(val name: String, val age: Int) {

    // Init block
    init {
        println("Welcome, $name! 🎉")
    }

    // Function to display info
    fun displayInfo() {
        println("Person -> Name: $name, Age: $age")
    }
}

// Class Employee
class Employee(val name: String, val employeeId: Int) {

    // Secondary constructor
    constructor(name: String) : this(name, 0)

    // Function to show details
    fun showDetails() {
        println("Employee -> Name: $name, ID: $employeeId")
    }
}

// Class Car1
class Car1(val model: String) {
    var year: Int = -1

    // Secondary constructor
    constructor(model: String, year: Int) : this(model) {
        this.year = year
    }

    // Init block
    init {
        println("Car1 object for '$model' created successfully! 🚗")
    }

    fun showCarDetails() {
        if (year == -1) {
            println("Car1 -> Model: $model, Year: Not specified")
        } else {
            println("Car1 -> Model: $model, Year: $year")
        }
    }
}

// Main function
fun main() {
    // Person object
    val person = Person1("Sarika", 22)
    person.displayInfo()

    println("------------------------------------------------")

    // Employee objects
    val empPrimary = Employee("Aarav", 101)
    val empSecondary = Employee("Ishita")

    empPrimary.showDetails()
    empSecondary.showDetails()

    println("------------------------------------------------")

    // Car1 objects
    val carPrimary = Car1("Tesla")
    carPrimary.showCarDetails()

    val carSecondary = Car1("BMW", 2024)
    carSecondary.showCarDetails()
}
