package collections

import kotlin.math.roundToInt

fun main() {
    Library.books.map { it.price }
        .reduce{ accumulator, price -> accumulator + price }
        .also{ println("Reduce:: Total price: $it") }

    Library.books.map { it.price }.sum()
        .also{ println("Sum:: Total price: $it") }

    Library.books.sumOf { it.price }
        .also{ println("SumOf:: Total price: $it") }

    Library.books.map { it.price }
        .average().roundToInt()
        .also{ println("Average:: Price: $it") }

    Library.books.minOf { it.price }
        .also{ println("MinOf:: Cheapest price: $it") }

    Library.books.maxOf { it.price }
        .also{ println("MaxOf:: Most expensive price: $it") }
}