package day18

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here
    val grouping: Map<Int, List<Int>> = ar.groupBy { it }
    val count = grouping.values.sumBy { list ->
        list.chunked(2).filter { it.size == 2 }.count()
    }
    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//    val n = 7
//    val ar = arrayOf(1, 2, 1, 2, 1, 3, 2,3,1)
    val result = sockMerchant(n, ar)

    println(result)
}
