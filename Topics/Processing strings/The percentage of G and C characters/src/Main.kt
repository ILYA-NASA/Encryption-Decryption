fun main() {
    val input = readln()
    val gGcC = listOf('g', 'G', 'c', 'C')
    var count = 0
    input.forEach { if (gGcC.contains(it)) count++ }
    println(count.toDouble() / input.length * 100)
}