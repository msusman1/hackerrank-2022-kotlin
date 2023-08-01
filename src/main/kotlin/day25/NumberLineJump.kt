package day25


fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    // Write your code here
    if (v1 < v2 || v1 == v2) {
        return "NO"
    }
    return if ((x2 - x1) % (v1 - v2) == 0) {
        "YES"
    } else {
        "NO"
    }
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")
//    val first_multiple_input = "43 2 70 2".split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
