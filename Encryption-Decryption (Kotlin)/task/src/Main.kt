package encryptdecrypt

import kotlin.math.abs

fun main() {
    getEncrypt(readln(), readln().toInt())
}

fun getEncrypt(secret: String, key: Int) {
    val alphabet = "abcdefghijklmnopqrstuvwxyz".toList()
    secret.forEach {
        print(
            if (it.isLetter()) {
                if (alphabet.indexOf(it) + key > alphabet.size)
                    alphabet[abs(alphabet.size - (alphabet.indexOf(it) + key))]
                else alphabet[alphabet.indexOf(it) + key]
            } else it
        )
    }
}

