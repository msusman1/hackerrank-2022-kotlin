package day23

import java.util.*

fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here
    val list = mutableListOf<List<Int>>()
    Arrays.sort(a)
    val temp = mutableListOf<Int>()
    a.forEach { n ->
        if (temp.all { n - it <= 1 }) {
            temp.add(n)
        } else {
            if (temp.size > 1) {
                list.add(temp.toList())
            }
            temp.clear()
            temp.add(n)
        }
    }
    if (temp.size > 1) {
        list.add(temp.toList())
    }

    return list.map { it.size }.sortedDescending().first()

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
//
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//    val a = arrayOf(4, 2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4, 2, 98, 1, 98, 98, 1, 1, 4, 98, 2, 98, 3, 9, 9, 3, 1, 4, 1, 98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 2, 3, 98, 98, 1, 99, 9, 98, 98, 3, 98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 9, 2, 4)
    val result = pickingNumbers(a)

    println(result)
}