fun main() {
    val repeatNum = readln().toInt()
    var result = readln().toInt()
    for (i in 2..repeatNum) {
        val countNum = readln().toInt()
        if (countNum < result) result = countNum
    }
    println(result)
}