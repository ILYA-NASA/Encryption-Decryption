package encryptdecrypt

fun main() = when (readln()) {
    "enc" -> getEncrypt(readln(), readln().toInt())
    "dec" -> getDecrypt(readln(), readln().toInt())
    else -> print("invalid input")
}

fun getEncrypt(futureSecret: String, key: Int) = futureSecret.forEach { print(it + key) }

fun getDecrypt(secret: String, key: Int) = secret.forEach { print(it - key) }