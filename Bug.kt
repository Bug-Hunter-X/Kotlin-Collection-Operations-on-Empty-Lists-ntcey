fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 } //This line causes an error when the list is empty
                            .filter { it > 3 } //This line causes an error when the list is empty
                            .reduce { acc, i -> acc + i }
    println(result)
}