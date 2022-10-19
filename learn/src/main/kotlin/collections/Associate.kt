package collections

fun main() {
    Library.books.associate {
        Pair(it.genres.first(), it) // Pair<Genre, Book>
    }.forEach{ key, value ->
        println("$key -> $value")
    }

    // DOES THE SAME AS THE PREVIOUS EXAMPLE
    // WE JUST HAVE TO DEFINE THE KEY
    Library.books.associateBy { it.genres.first() }.forEach { key, value ->
        println("$key -> $value")
    }

    // THE OPPOSITE OF ASSOCIATEBY
    // WE DEFINE THE VALUE
    Library.books.associateWith { it.genres.first() }.forEach { key, value ->
        println("$key -> $value")
    }

    val genreKey = Genre.Fiction.Fantasy
    val theType: Map<Genre, Book> = Library.books.associateBy { it.genres.first() }
    println("------- Retrieving a book from the $genreKey genre ----------")
    println(theType.get(genreKey))

    println("------- Printing all books ----------")
    val map =  Library.books.associateBy { it.genres.first() }
    println(map)
}