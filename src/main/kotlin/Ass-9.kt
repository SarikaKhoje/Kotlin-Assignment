// Step 2: Data class Book
data class Book(val title: String, val author: String, val price: Double)

// Step 3: Regular class Library
class Library(private val books: MutableList<Book> = mutableListOf()) {

    // Function to add a book
    fun addBook(book: Book) {
        books.add(book)
    }

    // Function to print all books
    fun printBooks() {
        println("Books in the Library:")
        for (book in books) {
            println("Title: ${book.title}, Author: ${book.author}, Price: ${book.price}")
        }
    }
}

fun main() {
    // Step 4: Add a few books and display them
    val library = Library()

    library.addBook(Book("The Alchemist", "Paulo Coelho", 350.0))
    library.addBook(Book("Atomic Habits", "James Clear", 499.0))
    library.addBook(Book("Ikigai", "Héctor García", 300.0))

    library.printBooks()
}
