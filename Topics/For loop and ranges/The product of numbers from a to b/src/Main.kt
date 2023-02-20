fun main() {
    println(productNum(readln().toInt(), readln().toInt()))
}

fun productNum(a: Int, b: Int): Long {
    var result = 1L
    for (i in a until b) result *= i
    return result
}