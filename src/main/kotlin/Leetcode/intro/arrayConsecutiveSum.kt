package leetcode.intro

fun main(args: Array<String>) {
    println(arrayConsecutiveSum(intArrayOf(1, 2, 3, 4, 5, 6)))
}
// find the consecutive sum of array
fun arrayConsecutiveSum(arr: IntArray): IntArray {
    val finalArr = IntArray(arr.size)
    finalArr[0] = arr.first()
    for (i in 1 until arr.size) {
        finalArr[i] = finalArr[i - 1] + arr[i]
    }
    var sum = 0
    return arr.map {
        sum += it
        sum
    }.toIntArray()
}
