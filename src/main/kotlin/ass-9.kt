// Step 2: Data class for Book
data class Book(val title: String, val author: String, val price: Double)

// Step 3: Regular class Library
class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun printBooks() {
        if (books.isEmpty()) {
            println("No books in the library.")
        } else {
            println("Library Books:")
            for ((index, book) in books.withIndex()) {
                println("${index + 1}. Title: ${book.title}, Author: ${book.author}, Price: ₹${book.price}")
            }
        }
    }
}

// Step 4: Main function to test
fun main() {
    val library = Library()

    // Add books to library
    library.addBook(Book("The Kotlin Journey", "John Doe", 499.0))
    library.addBook(Book("Advanced Kotlin", "Jane Smith", 799.0))
    library.addBook(Book("Kotlin for Beginners", "Chris White", 299.0))

    // Display books
    library.printBooks()
}
