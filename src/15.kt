fun generatePaths(n: Int): Long
    {
        var paths: ArrayList<Long> = arrayListOf()
        var counter = 0
        for (i in 2..n+1)
        {
            paths.add(i - 2, i.toLong())
        }
        println(paths)
        while (counter < n - 1)
        {
            paths.set(0, paths.get(0).toLong() + 1L)
            for (i in 1..n-1)
            {
                paths.set(i, paths.get(i - 1).toLong() + paths.get(i).toLong())
            }
            println(paths)
            counter++
        }
        return paths.get(paths.size - 1)
    }

fun main() {
    println(generatePaths(20))
}
