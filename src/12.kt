import kotlin.math.roundToInt

fun countFactors(x: Long): Long {
    var count: Long = 0
    for (i in 1..Math.sqrt(x.toDouble()).roundToInt()) {
        if (x % i == 0L) {
            if (x / i == i.toLong()) {
                count++
            }
            else {
                count += 2
            }
        }
    }
    return count
}

fun factorLimit(n: Long): Long { // n is the number which you want the num of factors to exceed
    var num1: Long = 1
    var num2: Long = num1 * (num1 + 1) / 2

    while (countFactors(num2) <= n) {
        num1++
        num2 = num1 * (num1 + 1) / 2
    }
    return num2
}

fun main() {
    println(factorLimit(500))
}