import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val inputList = mutableListOf<Int>()
    while (sc.hasNext()) {
        inputList += sc.nextInt()
    }
    val result = inputList.maxOrNull()
    print("$result ${inputList.indexOf(result) + 1}")
}