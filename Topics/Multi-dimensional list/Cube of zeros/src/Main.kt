fun main() {
    val cubeOfZero = mutableListOf(
        mutableListOf(mutableListOf(0, 0, 0), mutableListOf(0, 0, 0), mutableListOf(0, 0, 0)),
        mutableListOf(mutableListOf(0, 0, 0), mutableListOf(0, 0, 0), mutableListOf(0, 0, 0)),
        mutableListOf(mutableListOf(0, 0, 0), mutableListOf(0, 0, 0), mutableListOf(0, 0, 0))
    )
    println(cubeOfZero)
}

// fun main() = List(3) { List(3) { List(3) { 0 } } }.let(::print)