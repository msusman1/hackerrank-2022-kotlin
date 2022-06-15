package day14

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'pangrams' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun pangrams(s: String): String {
    // Write your code here
    val str = s.lowercase()
    val isPangram = str.toCharArray().filter {it!= ' ' }.distinct().size == 26
    return if (isPangram) "pangram" else "not pangram"
}

fun main(args: Array<String>) {
//    val s = readLine()!!
val s="the quick brown fox jumps over the lazy dog"
    val result = pangrams(s)

    println(result)
}
