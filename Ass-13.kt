// Step 2: Data class
data class Student(val name: String, val age: Int, val company: String)

fun main() {
    // Step 3: Immutable list of 5 students
    val immutableStudents = listOf(
        Student("Sarika", 22, "Microsoft"),
        Student("Aarav", 21, "Google"),
        Student("Meera", 23, "Amazon"),
        Student("Rohan", 20, "Infosys"),
        Student("Kavya", 22, "TCS")
    )
    println("Immutable Students List: $immutableStudents")

    // Step 4: Attempt to add (❌ will fail because immutable lists cannot be modified)
    // immutableStudents.add(Student("Nikhil", 24, "Wipro"))  // Compile error
    println("Immutable lists cannot be modified. Attempting to add will cause an error.")

    // Step 5: Mutable list of 5 student names
    val mutableStudents = mutableListOf("Sarika", "Aarav", "Meera", "Rohan", "Kavya")
    println("Initial Mutable List: $mutableStudents")

    // Step 6a: Add 2 new names
    mutableStudents.add("Nikhil")
    mutableStudents.add("Priya")

    // Step 6b: Update the name at index 1
    mutableStudents[1] = "Arjun"

    // Step 6c: Remove a name by value
    mutableStudents.remove("Rohan")

    // Step 6d: Retrieve and print the name at index 2
    println("Name at index 2: ${mutableStudents[2]}")

    println("After modifications: $mutableStudents")

    // Step 7a: Print using for loop
    println("Using for loop:")
    for (student in mutableStudents) {
        println(student)
    }

    // Step 7b: Print using iterator
    println("Using iterator:")
    val iterator = mutableStudents.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}
