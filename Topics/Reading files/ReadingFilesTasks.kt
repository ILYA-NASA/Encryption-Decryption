import java.io.File

fun main() {

    var count = 0
    File("C:/Users/user/Downloads/words_with_numbers.txt").forEachLine { if (it.first().isDigit()) count++ }
    println(count)

    var lengthLine = 0
    File("C:/Users/user/Downloads/words_sequence.txt").forEachLine {
        if (it.length > lengthLine) lengthLine = it.length
    }
    println(lengthLine)

}