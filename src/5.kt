fun problem5(): Long {
    var i: Long = 2520
    var found = false
    while (found == false) {
        var divis = true
        for (j in 11..20) {
            if (i % j != 0L) {
                divis = false
                i += 2520
                break
            } else {

            }
        }
        if (divis == true) {
            found = true
        }
    }
    return i
}

fun main(args: Array<String>) {
    println(problem5())
}