package day16

import java.util.*

fun twoArrays(k: Int, A: Array<Int>, B: Array<Int>): String {
    val ziped = A.sorted().zip(B.sortedArrayDescending())
    val found = ziped.all { it.first + it.second >= k }
    return if (found) "YES" else "NO"
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

      for (qItr in 1..q) {
          val first_multiple_input = readLine()!!.trimEnd().split(" ")

          val n = first_multiple_input[0].toInt()

          val k = first_multiple_input[1].toInt()

          val A = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

          val B = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

          val result = twoArrays(k, A, B)

          println(result)
      }


//    val A = arrayOf(1, 2, 2, 1)
//    val B = arrayOf(3, 3, 3, 4)
//    val k = 5
//    println(twoArrays(k, A, B))
}


