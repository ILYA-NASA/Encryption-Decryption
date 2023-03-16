package encryptdecrypt

import java.io.File

fun main(args: Array<String>) {

    val mode = args[args.indexOf("-mode") + 1]
    val key = args[args.indexOf("-key") + 1].toInt()
    val data = args[args.indexOf("-data") + 1]
    val inFileName = args[args.indexOf("-in") + 1]
    val outFileName = args[args.indexOf("-out") + 1]

    val inFile = File(inFileName)
    val inFileData = inFile.readText()

    val outFile = File(outFileName)

//    val encryptText = ::getEncrypt
//    val decryptText = ::getDecrypt

    when (mode) {
    "dec" -> outFile.writeText(getDecrypt(inFileData, key))
    else -> outFile.writeText(getEncrypt(inFileData, key))
    }

}

fun getEncrypt(data: String, key: Int): String {
    var result = ""
    data.forEach { result += it + key }
//    println(result)
    return result
}

fun getDecrypt(data: String, key: Int): String {
    var result = ""
    //    println(result)
    data.forEach { result += it - key }
    return result
}

//mode: String = "enc", key: Int = 0, data: String = "",
//inFileName: String = "", outFileName: String = "",