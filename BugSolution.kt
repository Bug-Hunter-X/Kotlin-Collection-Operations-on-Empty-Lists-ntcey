fun main() {
    val list = listOf<Int>() //Testing with empty list
    val result = list.ifEmpty { listOf(0) } // Handle empty list case
                      .map { it * 2 }
                      .filter { it > 3 }
                      .reduceOrNull { acc, i -> acc + i } ?: 0 //Use reduceOrNull to handle empty list after map and filter
    println(result) //Output will be 0

    val list2 = listOf(1, 2, 3, 4, 5)
    val result2 = list2.ifEmpty { listOf(0) }
                       .map { it * 2 }
                       .filter { it > 3 }
                       .reduceOrNull { acc, i -> acc + i } ?: 0
    println(result2) // Output will be 18
} 