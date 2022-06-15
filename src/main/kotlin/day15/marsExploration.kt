@file:OptIn(ExperimentalStdlibApi::class)

package day15

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
 * Complete the 'marsExploration' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */
fun chardiff(s1: String, s2: String): Int {
    var totalDiff = 0
    s1.forEachIndexed { index, c ->
        if (s2[index] != c) totalDiff++

    }
    return totalDiff
}

fun marsExploration(s: String): Int {
    // Write your code here
    val messages = s.chunked(3)

    val changedMsg = messages.map {
        chardiff(it, "SOS")
    }.sum()

    return changedMsg
}

fun main(args: Array<String>) {
    val s = readLine()!!
//    val s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS"
//    val d = "SOSOOSOSOSOSOSSOSOSOSOSOSOS"
    val result = marsExploration(s)

    println(result)
}


