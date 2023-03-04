fun main() {
    val firstRange = readln().toInt()..readln().toInt()
    val secondRange = readln().toInt()..readln().toInt()
    val lastNumber = readln().toInt()
    println(lastNumber in firstRange || lastNumber in secondRange)
}
