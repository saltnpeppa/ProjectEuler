import kotlin.math.roundToLong
import kotlin.math.sqrt

fun primeFactor(n: Double): ArrayList<Long>{
    var list = arrayListOf<Long>()
    for (i in 1..(sqrt(n)).toLong()){
        if (n.roundToLong() % i == 0L) {
            if(getFactor(i).size == 2){
                list.add(i)
            }
        }
    }
    return list
}

fun getFactor(x:Long): ArrayList<Long>{
    var factorsList = arrayListOf<Long>()
    for (i in 1..x){
        if (x % i == 0L){
            factorsList.add(i)
        }
    }
    return factorsList
}


fun main(args: Array<String>) {
    println(primeFactor(600851475143.0))
}
