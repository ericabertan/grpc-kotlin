package collections

fun main() {
    // WHILE
    Library.books.iterator().let { iterator ->
        while(iterator.hasNext()) {
            val book = iterator.next()
            println(book)
        }
    }

    // FOR
    Library.books.let { books: List<Book> ->
        for (book in books) {
            println(book)
        }
    }

    // FOREACH
    Library.books.forEach { book ->
        println(book)
    }

    // FOREACH INDEXED
    Library.books.forEachIndexed { index, book ->
        println("$index, $book")
    }
}