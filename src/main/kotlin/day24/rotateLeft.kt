package day24

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'rotateLeft' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER d
 *  2. INTEGER_ARRAY arr
 */

fun rotateRight(d: Int, arr: Array<Int>): Array<Int> {
    return rotateLeft(arr.size - d, arr)
}

fun rotateLeft(d: Int, arr: Array<Int>): Array<Int> {
    val list = mutableListOf<Int>()
    for (i in arr.indices) {
        val finalIndex = (i + d) % arr.size
        list.add(arr[finalIndex])
    }
    return list.toTypedArray()
}


fun main(args: Array<String>) {
//    val first_multiple_input = readLine()!!.trimEnd().split(" ")
//    val n = first_multiple_input[0].toInt()
//    val d = first_multiple_input[1].toInt()
//    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val d = 2
    val arr = arrayOf(1, 2, 3, 4, 5)
    val result = rotateRight(d, arr)

    println(result.joinToString(" "))
}
