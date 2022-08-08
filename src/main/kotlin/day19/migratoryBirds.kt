package day19

fun migratoryBirds(arr: Array<Int>): Int {
    // Write your code here
    val grouping: Map<Int, List<Int>> = arr.groupBy { it }
    val sorted = grouping.values.sortedByDescending { it.size }
    return sorted.first().first()
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//    val arr = arrayOf(1, 1, 2, 2, 3)
    val result = migratoryBirds(arr)

    println(result)
}