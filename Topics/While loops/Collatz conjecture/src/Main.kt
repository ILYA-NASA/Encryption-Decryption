@Suppress("MagicNumber")
fun main() {
    var n = readln().toInt()
    while (n != 1) {
        print("$n ")
        if (n % 2 == 0) {
            n /= 2
        } else n = n * 3 + 1
    }
    print(n)
}