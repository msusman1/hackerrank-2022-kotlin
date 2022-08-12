package day20

import java.util.*

fun maximumPerimeterTriangle(sticks: Array<Int>): Array<Int> {
    // Write your code here
    Arrays.sort(sticks)
    val n = sticks.size
    for (i in 0..sticks.size - 3) {
        val x = sticks[n - 1 - i]
        val y = sticks[n - 2 - i]
        val z = sticks[n - 3 - i]
        if (y + z > x) {
            val arrayOf = arrayOf(x, y, z)
            Arrays.sort(arrayOf)
            return arrayOf
        }

    }
    return arrayOf(-1)
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

//    val sticks = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val sticks = arrayOf(1, 2, 3)
    val result = maximumPerimeterTriangle(sticks)

    println(result.joinToString(" "))
}