package collections

fun main() {
    listOf(10, -12, 4, 2, 5, 100, 3).sorted()
        .also{ println(it) }

    Library.books.sortedBy { book ->
        book.title
    }.forEach { println(it.title) }

    Library.books.sortedByDescending { book ->
        book.title
    }.forEach { println(it.title) }

    Library.books.reversed().forEach { println(it.title) }

    Library.books.sortedBy { it.title }
        .shuffled() // random
        .forEach { println(it.title) }
}