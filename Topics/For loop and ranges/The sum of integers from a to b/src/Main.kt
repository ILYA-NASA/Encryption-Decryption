/*
fun main() {
    var result = 0
    for (i in readln().toInt()..readln().toInt()) result += i
    println(result)
}
*/

fun main() = print((readln().toInt()..readln().toInt()).sum())