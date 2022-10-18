package collections

fun main() {
    val listOfAListAuthors: List<List<Author>> = Library.books.map { it.authors }
        .also{ it.forEach{ println(it) } }

    val authors: List<Author> = listOfAListAuthors.flatten()
        .also{ it.forEach{ println(it)} }

    val flapMappedAuthors: List<String> = listOfAListAuthors
        .flatMap { authorList ->
//            val flattenedAuthorNames = mutableListOf<String>()
//            authorList.forEach{ author ->
//                flattenedAuthorNames.add(author.name)
//            }
//            flattenedAuthorNames
            authorList.map{ it.name }
        }.also{ it.forEach{ println(it) }}
}