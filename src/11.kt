fun horizontalProduct(input: ArrayList<Int>): ArrayList<Int> {
    var i = 0
    var hort = arrayListOf<Int>()

    for (j in 1 until input.size) {
        if ((i + 1) % 3 != 0) { // This 3 should be 20 and the 1 should be 2
            hort.add(input.subList(i, i+2).reduce { acc, n -> acc * n  }) // This is example specific, 2 should be 4
            i += 1
        } else {
            i += 1
        }
    }

    return hort
}

fun verticalProduct(input: ArrayList<Int>): ArrayList<Int> { // Example specific
    var i = 0
    val vert = arrayListOf<Int>()

    for (j in 1 until input.size - 2) { // The -2 is example specific, should be 19
        vert.add(input[i] * input[i + 3]) // The 3 is example specific
        i += 1
    }

    return vert
}

fun main() {
    println(verticalProduct(arrayListOf(1,2,3,4,5,6,7,8,9)))
    println(horizontalProduct(arrayListOf(1,2,3,4,5,6,7,8,9)))

}

