enum class RainbowOrder {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun main() {
    val color = readln()
    println(RainbowOrder.valueOf(color.uppercase()).ordinal + 1)
}