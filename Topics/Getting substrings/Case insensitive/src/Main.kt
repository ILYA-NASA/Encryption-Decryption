fun main() = println(comparesTwoLinesIgnoreCase(readln(), readln()))

fun comparesTwoLinesIgnoreCase(firstLine: String, secondLine: String) = firstLine.lowercase() == secondLine.lowercase()