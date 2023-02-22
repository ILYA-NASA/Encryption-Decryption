import java.util.*

fun main() {
    val taskList = MutableList(readln().toInt()) { readln().toInt() }
    var rotate = readln().toInt()
    val resultList = mutableListOf<Int>()

    rotate %= taskList.size

    for (i in taskList.size - rotate until taskList.size) {
        resultList.add(taskList[i])
    }
    for (i in 0 until taskList.size - rotate) {
        resultList.add(taskList[i])
    }

    println(resultList.joinToString(" "))

//    Collections.rotate(taskList, rotate)
//    println(taskList.joinToString(" "))
}