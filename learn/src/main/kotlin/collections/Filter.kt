package collections

fun main() {
    val multipleAuthors = Library.books
        .filter {
            it.authors.size > 1
        }
        .map{
            "${it.title} by ${it.authors.joinToString { it.name }}"
        }
        .also {
            it.forEach{ println (it) }
        }

    val fantasy = Library.books
        .filter { book ->
            book.genres.any { genre ->
                genre is Genre.Fiction.Fantasy
            }
        }
        .map{
            "${it.title} is ${it.genres}"
        }
        .also {
            it.forEach{ println (it) }
        }

    val notFiction = Library.books
        .filter { book ->
            book.genres.none { genre ->
                genre is Genre.Fiction
            }
        }
        .map{
            "${it.title} is ${it.genres} and is not Fictional"
        }
        .also {
            it.forEach{ println (it) }
        }

    val allFiction = Library.books
        .filter { book ->
            book.genres.all { genre ->
                genre is Genre.Fiction
            }
        }
        .map{
            "${it.title} ---> ${it.genres}"
        }
        .also {
            it.forEach{ println (it) }
        }

    val allFictionNotRowling = Library.books
        .filterNot { book ->
            book.authors.any { author ->
                author.name == "J.K. Rowling"
            }
        }
        .map{
            "${it.title} ---> ${it.genres} and not written by J.K. Rowling"
        }
        .also {
            it.forEach{ println (it) }
        }
}