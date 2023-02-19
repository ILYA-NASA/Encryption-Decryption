package encryptdecrypt

fun main() {
    getEncrypt("we found a treasure!")
}

fun getEncrypt(secret: String) {
    secret.forEach { print(if (it.isLetter()) 'z' - (it - 'a') else it) }
    // abcdefghijklmnopqrstuvwxyz
    // zyxwvutsrqponmlkjihgfedcba
}

