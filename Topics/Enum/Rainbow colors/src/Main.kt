fun main() = print(Rainbow.search(readln().uppercase()))

enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;

    companion object {
        fun search(colour: String): Boolean {
            for (enum in values()) {
                if (colour == enum.name) {
                    return true
                }
            }
            return false
        }
    }
}
