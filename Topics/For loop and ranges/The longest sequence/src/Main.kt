fun main() {

    val inputArray = IntArray(readln().toInt()) { readln().toInt() }
//    println(inputArray.joinToString())
    var count = 0
    var countsArray = arrayOf(count)
    var currentValue = inputArray[0]

    inputArray.forEach {
        if (it >= currentValue) {
            currentValue = it
            countsArray += ++count
        } else {
            currentValue = it
            count = 1
        }
    }

//    println(countsArray.joinToString())
    println(countsArray.maxOrNull())

}