const val TASK_NUM = 3
/*
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()
    var count = 0
    for (i in a..b) {
        if (i % n == 0) count++
    }
    println(count)
}
*//*
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()
    println((a..b).count() { it % n == 0 })
}
*/
fun main() {
    val (a, b, n) = MutableList(TASK_NUM) { readln().toInt() }
    println((a..b).count() { it % n == 0 })
}