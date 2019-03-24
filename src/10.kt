fun otherPrimes(): List<Int> {
    var list = arrayListOf<Int>()
    for (i in 1..20000){
        if (i % 2 != 0) {
            if ((getFactor(i.toLong())).size == 2) {
                list.add(i)
            }
        }
    }
    return list
}

fun main(args: Array<String>) {
    println((otherPrimes().sum().toLong()))
}