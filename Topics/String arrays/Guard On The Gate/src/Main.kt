fun main() {
    val backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val returnedWatchman = readLine()!!.toString()  
    // do not touch the lines above
    // write your code here   
    print(backFromTheWall.plusElement(returnedWatchman).joinToString())
}