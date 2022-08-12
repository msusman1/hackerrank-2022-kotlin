package day22

import java.util.*
import kotlin.math.absoluteValue


fun pageCount(n: Int, p: Int): Int {
    // Write your code here
    val countFromLeft = p / 2
    val countFromRight = if (n % 2 == 0) {
        (n - p + 1) / 2
    } else {
        (n - p) / 2
    }
    return Math.min(countFromLeft, countFromRight)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val p = readLine()!!.trim().toInt()
//    val n = 6
//    val p = 5


    val result = pageCount(n, p)

    println(result)
}