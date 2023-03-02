// write your function here
fun isVowel(ch: String): Boolean = "aeiou".contains(ch.lowercase())

fun main() {
    val letter = readln()
    println(isVowel(letter))
}