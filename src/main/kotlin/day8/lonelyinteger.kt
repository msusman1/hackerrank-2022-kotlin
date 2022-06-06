package day8

fun lonelyinteger(a: Array<Int>): Int {
    // Write your code here
    val groupings: Map<Int, List<Int>> =a.groupBy { it }
    val oneSizeKey =groupings.filter {
        it.value.size==1
    }.keys.first()
    return oneSizeKey
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//    val a = arrayOf(1, 2, 3, 4, 3, 2, 1)
    val result = lonelyinteger(a)

    println(result)
}