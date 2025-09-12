class Person(val name: String, val age: Int) {

    // Secondary constructor with default age = 18
    constructor(name: String) : this(name, 18)

    // Init block (executes when object is created)
    init {
        println("Person created → Name: $name, Age: $age")
    }
}

fun main() {
    // Creating Person using primary constructor
    val person1 = Person("Sarika", 22)

    // Creating Person using secondary constructor
    val person2 = Person("Aarav")
}
