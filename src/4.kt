fun reverseNumber(n: Int): Int {
    val nToInt: Int = n.toString().reversed().toInt() // Reverse the Number
    return nToInt
}

fun main(args: Array<String>) {
    var list: MutableList<Int> = mutableListOf()
    val x: Int = 999
    for (i in 100..999){
        for (n in 100..999){
            if (reverseNumber(i*n) == i*n){
                list.add(i*n)
            }
        }
    }

    val newList: List<Int> = list.sortedDescending()
    println(newList[0])

}