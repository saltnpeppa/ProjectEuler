import kotlin.math.*

fun getFactor2(x:Double): ArrayList<Double> {
    var factorsList = arrayListOf<Double>()
    for (i in 1..x.toInt()) {
        if (x % i== 0.0) {
            factorsList.add(i.toDouble())
        }
    }
    return factorsList
}

// r has to be even

fun genTriples(r: Double): ArrayList<Double> { // Prints pyth. triples based on an r value using Dickson's method
    val factorsList = arrayListOf<Double>()
    val aList = arrayListOf<Double>()
    val product = r.pow(2) / 2
    val possibilities = getFactor2(product)

    for (i in 0..((possibilities.size / 2)) - 1) {
        var list = arrayListOf<Double>(possibilities[i], possibilities[possibilities.size - 1 - i])
        factorsList.addAll(list)
    }
    var i = 0
    while (i <= factorsList.size - 2) {
        val x = (r + factorsList[i])
        val y = (r + factorsList[i + 1])
        val z = (r + factorsList[i] + factorsList[i + 1])
        val a = (x + y + z)
        i += 2
        aList.add(a)
    }
    return aList
}

//r = 75
// 13th triple
fun main() {

    genTriples2(150.0) // The triples are 200, 375, 425

}

fun genTriples2(r: Double) {
    val factorsList = arrayListOf<Double>()
    val aList = arrayListOf<Double>()
    val product = r.pow(2) / 2
    val possibilities = getFactor2(product)

    for (i in 0..((possibilities.size / 2)) - 1) {
        var list = arrayListOf<Double>(possibilities[i], possibilities[possibilities.size - 1 - i])
        factorsList.addAll(list)
    }
    var i = 0
    while (i <= factorsList.size - 2) {
        println(r + factorsList[i])
        println(r + factorsList[i + 1])
        println(r + factorsList[i] + factorsList[i + 1])
        i+=2
    }
}