
fun fib(n: Int): Int{
    if (n<2){
        return n
    }else{
        return fib(n-1) + fib(n-2)
    }
}

fun main(args: Array<String>) {
    var list = arrayListOf<Int>()
    var list2: ArrayList<Int> = arrayListOf()
    for (i: Int in 1..33) { // The reason I set the upper bound was because I ran the fibonacci sequence and found which value of "i" will allow fib(i) to be less than 4 million.
        if (fib(i) <= 4000000) {
            if (fib(i) % 2 == 0) {
                list.add(fib(i))
            }
        }
    }
    println(list.sum())
}
