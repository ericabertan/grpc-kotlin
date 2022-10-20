package collections

import kotlin.system.measureTimeMillis

fun main(){

    (0 until 25).map{
        measureTimeMillis {
            testingWithSequences()
        }
    }.average().also{ executionTime -> println("Executed in ${executionTime}ms") }
}

fun testingWithSequences() {
    Library.books
        .asSequence()
        .map { book ->
            book.copy(title = book.title.uppercase())
        }
        .map { book->
            val firstAuthor = book.authors.first()
            book.copy(authors = listOf(firstAuthor))
        }
        .filter { book ->
            book.genres.all { it is Genre.NonFiction }
        }
        .filter { book ->
            book.price >= 1000
        }
        .map { book ->
            book.title
        }
        .forEach { bookTitle -> println(bookTitle) }
}