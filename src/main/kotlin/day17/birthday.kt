package day17


fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // Write your code here
    var count = 0
    for (i in s.indices) {
        if (i + m <= s.size) {
            val slice: List<Int> = s.slice(i until i + m)
            val sum = slice.sum()
            if (sum == d) {
                count++
            }
        }
    }
    return count
}

fun main(args: Array<String>) {
     val n = readLine()!!.trim().toInt()

     val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

     val first_multiple_input = readLine()!!.trimEnd().split(" ")

     val d = first_multiple_input[0].toInt()

     val m = first_multiple_input[1].toInt()

//    val s = arrayOf( 4)
//    val d = 4
//    val m = 1
    val result = birthday(s, d, m)

    println(result)
}
