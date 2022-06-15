package day11

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
import kotlin.math.absoluteValue
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    val leftToRightDiagonal = Array(arr.size){0}
    val rightToLeftDiagonal =  Array(arr.size){0}
    arr.forEachIndexed { rowIndex, row ->
        leftToRightDiagonal[rowIndex] = row[rowIndex]
        rightToLeftDiagonal[rowIndex] = row[(row.size-1) - rowIndex]
    }
    val sum: Int = leftToRightDiagonal.sum() - rightToLeftDiagonal.sum()
    return Math.abs(sum)
}

fun main(args: Array<String>) {
      val n = readLine()!!.trim().toInt()

      val arr = Array(n) { Array(n) { 0 } }

      for (i in 0 until n) {
          arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
      }
//    val arr: Array<Array<Int>> = arrayOf(arrayOf(11, 2 ,4), arrayOf(11, 2 ,4), arrayOf(10, 8 ,-12))

    val result = diagonalDifference(arr)

    println(result)
}