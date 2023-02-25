fun main() {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
    val input = readln()
    var result = 0
    var countVow = 0
    var countCons = 0
    input.forEach {
        if (vowels.contains(it)) {
            countVow++
            countCons = 0
        } else {
            countCons++
            countVow = 0
        }
        if (countCons > 2) {
            result++
            countCons = 1
        }
        if (countVow > 2) {
            result++
            countVow = 1
        }
    }
    println(result)
}