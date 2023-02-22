fun main() {
    val countOfCompany = readln().toInt()
    val incomeAndPercent =
        MutableList(countOfCompany * 2) { readln().toInt() }

    val taxPaid = mutableListOf<Int>()
    for (i in 0 until countOfCompany) {
        taxPaid.add(incomeAndPercent[i] * incomeAndPercent[i + countOfCompany])
    }

    val maxTax = taxPaid.maxOrNull()
    println(taxPaid.indexOf(maxTax) + 1)
}