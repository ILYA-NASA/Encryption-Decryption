    val lambda: (Long, Long) -> Long = { a, b ->
        var res = b
        for (i in a until b) res *= i
        res
    }