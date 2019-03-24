fun main(args: Array<String>) {
    val list = arrayListOf<Int>()
    for (i in 1..100){
        list.add(i * i)
    }

    println(5050*5050 -(list.sum()))


}