package collections

fun main() {
    val fictionNonFiction: Pair<List<Book>, List<Book>> =
        Library.books.partition { book ->
            book.genres.all { genre ->
                genre is Genre.NonFiction
            }
        }

    // EVERYTHING THAT MATCHES THE PREDICATE ABOVE
    println("=== Non Fiction ===")
    fictionNonFiction.first.forEach{ println(it) }

    // ANYTHING ELSE THAT DOESN'T MATCH THE PREDICATE ABOVE
    println("=== Fiction ===")
    fictionNonFiction.second.forEach { println(it) }
}