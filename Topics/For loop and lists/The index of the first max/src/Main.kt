fun main() {
    val taskList = MutableList(readln().toInt()) { readln().toInt() }
    println(taskList.indexOf(taskList.maxOrNull()))
}