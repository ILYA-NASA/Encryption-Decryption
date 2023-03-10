package encryptdecrypt

import java.io.File

fun main(args: Array<String>) {
    val mode = args[args.indexOf("-mode") + 1]
    val key = args[args.indexOf("-key") + 1]
    val data = args[args.indexOf("-data") + 1]
    val inFileName = args[args.indexOf("-in") + 1]
    val outFileName = args[args.indexOf("-out") + 1]
    controller(mode = mode, key = key, data = data, inFileName = inFileName, outFileName = outFileName)
}

fun controller(
    mode: String = "enc", key: String = "0", data: String = "",
    inFileName: String = "", outFileName: String = "",
) {
    when (mode) {
        "enc" -> writeFile(inFileName, key.toInt(), outFileName)
        "dec" -> writeFile(inFileName, key.toInt(), outFileName)
    }
}

fun writeFile(inFileName: String, key: Int, outFileName: String = "") {
    val inFile = File(inFileName)
    val inFileData = inFile.readText()
    println(inFileData)
    val outFile = File(outFileName)
    outFile.writeText(getEncrypt(inFileData, key))
    outFile.writeText(getDecrypt(inFileData, key))
}

fun getEncrypt(data: String, key: Int): String {
    var result = ""
    data.forEach { result += it + key }
    return result
}
fun getDecrypt(data: String, key: Int): String {
    var result = ""
    data.forEach { result += it - key }
    return result
}