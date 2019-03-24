fun primes(): List<Int> {
    var list = arrayListOf<Int>()
    for (i in 1..105000){
        if((getFactor(i.toLong())).size == 2) {
            list.add(i)
        }

    }
    return list
}

fun main(args: Array<String>) {
    println((primes())[10000])
}