package leetcode.array

fun main(args: Array<String>) {
    println(sortedSquares(intArrayOf(-4, -1, 0, 3, 10)))
}

fun sortedSquares(nums: IntArray): IntArray {

    return nums.map { it * it }.sorted().toIntArray()
}