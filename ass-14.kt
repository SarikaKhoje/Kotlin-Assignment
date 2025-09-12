fun main() {
    // Step 2: Create a mutable set with duplicate numbers
    val numbers = mutableSetOf(1, 2, 2, 3, 4, 5, 5)  
    println("Initial Set (duplicates removed automatically): $numbers")

    // Step 3: Attempt to add an element
    numbers.add(6)
    println("After adding 6: $numbers")

    // Step 4: Add 2 new elements
    numbers.add(7)
    numbers.add(8)
    println("After adding 7 and 8: $numbers")

    // Step 5: Update an element (simulate remove old, add new)
    if (numbers.contains(3)) {
        numbers.remove(3)
        numbers.add(30)
    }
    println("After updating 3 → 30: $numbers")

    // Step 6: Remove an element
    numbers.remove(2)
    println("After removing 2: $numbers")

    // Step 7: Retrieve and print all elements
    println("All elements in the set: $numbers")

    // Step 8a: Print using for loop
    println("Using for loop:")
    for (num in numbers) {
        println(num)
    }

    // Step 8b: Print using iterator
    println("Using iterator:")
    val iterator = numbers.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}
