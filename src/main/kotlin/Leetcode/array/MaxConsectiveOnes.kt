package leetcode.array

fun main(args: Array<String>) {
    val arr = intArrayOf(1,0,1,1,1)
    println(findMaxConsecutiveOnes(arr))
}

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var globalMax = 0
    var localMax = 0
    for (i in 0..nums.lastIndex) {
        if (nums[i] == 0) {
            if (localMax > globalMax) {
                globalMax = localMax
            }
            localMax = 0
        } else {
            localMax++
        }
    }
    if (localMax > globalMax) {
        globalMax = localMax
    }
    return globalMax
}

