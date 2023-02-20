@Suppress("MagicNumber")
val taskRange = 0..1_000

fun main() {
    RootsEquation(readln().toInt(), readln().toInt(), readln().toInt(), readln().toInt())
}

class RootsEquation(a: Int, b: Int, c: Int, d: Int) {

    init {
        for (i in taskRange) {
            if (a * i * i * i + b * i * i + c * i + d == 0) println(i)
        }
    }
}