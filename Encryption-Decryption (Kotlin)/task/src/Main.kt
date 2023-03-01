package encryptdecrypt

fun main(args: Array<String>) {
    val mode = args[args.indexOf("-mode") + 1]
    val key = args[args.indexOf("-key") + 1]
    val data = args[args.indexOf("-data") + 1]
    when (mode) {
        "enc" -> getEncrypt(data, key.toInt())
        "dec" -> getDecrypt(data, key.toInt())
        else -> getEncrypt(data, key.toInt())
    }
}

fun getEncrypt(futureSecret: String, key: Int) = futureSecret.forEach { print(it + key) }

fun getDecrypt(secret: String, key: Int) = secret.forEach { print(it - key) }