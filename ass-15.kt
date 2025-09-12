fun main() {
    // Step 2: Immutable map
    val countries = mapOf(
        "India" to "New Delhi",
        "Japan" to "Tokyo",
        "France" to "Paris"
    )
    println("Immutable map: $countries")

    // Step 3: Attempt to add entry (will fail because immutable maps cannot be modified)
    // countries["USA"] = "Washington DC" // ❌ This will not compile
    println("Immutable maps in Kotlin cannot be modified. Attempting to add will cause a compilation error.")

    // Step 4: Mutable map with same data
    val mutableCountries = mutableMapOf(
        "India" to "New Delhi",
        "Japan" to "Tokyo",
        "France" to "Paris"
    )
    println("Initial Mutable Map: $mutableCountries")

    // Add 2 new entries
    mutableCountries["USA"] = "Washington DC"
    mutableCountries["Germany"] = "Berlin"
    println("After adding USA & Germany: $mutableCountries")

    // Update the capital of an existing country
    mutableCountries["India"] = "Delhi"
    println("After updating India’s capital: $mutableCountries")

    // Remove an entry
    mutableCountries.remove("France")
    println("After removing France: $mutableCountries")

    // Retrieve and print the capital of a country
    val capitalOfJapan = mutableCountries["Japan"]
    println("Capital of Japan: $capitalOfJapan")

    // Step 5a: Print using for loop
    println("Using for loop:")
    for ((country, capital) in mutableCountries) {
        println("$country → $capital")
    }

    // Step 5b: Print using iterator
    println("Using iterator:")
    val iterator = mutableCountries.entries.iterator()
    while (iterator.hasNext()) {
        val entry = iterator.next()
        println("${entry.key} → ${entry.value}")
    }
}
