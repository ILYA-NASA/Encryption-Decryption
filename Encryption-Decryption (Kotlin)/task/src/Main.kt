package encryptdecrypt

fun main(args: Array<String>) {
    val mode = args[args.indexOf("-mode") + 1]
    val key = args[args.indexOf("-key") + 1]
    val data = args[args.indexOf("-data") + 1]
    controller(mode = mode, key = key, data = data)
}
fun controller(mode: String = "enc", key: String = "0", data: String = "") {
    when (mode) {
        "enc" -> printEncrypt(data, key.toInt())
        "dec" -> printDecrypt(data, key.toInt())
    }
}

fun printEncrypt(futureSecret: String, key: Int) = futureSecret.forEach { print(it + key) }

fun printDecrypt(secret: String, key: Int) = secret.forEach { print(it - key) }
