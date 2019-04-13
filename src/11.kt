fun horizontalProduct(input: ArrayList<Int>) {
    var i = 0

    for (j in 1 until input.size) {
        if ((i + 1) % 3 != 0) {
            println(input.subList(i, i+2).reduce { acc, n -> acc * n  }) // This is example specific
            i += 1
        } else {
            i += 1
        }
    }
}

fun verticalProduct(input: ArrayList<Int>) { // Example specific
    var i = 0

    for (j in 1 until input.size - 2) { // The -2 is example specific
        println(input[i] * input[i + 3]) // The 3 is example specific
        i += 1
    }
}

fun main() {
    verticalProduct(arrayListOf(1,2,3,4,5,6,7,8,9))
}

