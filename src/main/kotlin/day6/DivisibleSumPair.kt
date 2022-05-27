package day6


fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    // Write your code here

    var count = 0
    for (i in ar.indices) {
        for (j in ar.indices) {
            if (i != j && i < j && (ar[i] + ar[j]) % k == 0) {
                count++
            }
        }
    }
    return count
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
 /*   val n=6;
    val k=3;
    val ar= arrayOf(1, 3, 2, 6, 1, 2)*/
    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
