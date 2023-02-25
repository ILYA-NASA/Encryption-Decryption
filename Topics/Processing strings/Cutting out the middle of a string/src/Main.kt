fun main() {
    val input = readln()
    if (input.length % 2 == 0) println(input.removeRange(input.length / 2 - 1..input.length / 2))
    else println(input.removeRange(input.length / 2..input.length / 2))
}