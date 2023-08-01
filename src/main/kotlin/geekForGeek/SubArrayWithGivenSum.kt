package geekForGeek

import java.util.HashMap

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 4, 20, 3, 10, 5)
    val targetSum = 20
//    val subArray = getSubArrayBruteForce(arr, targetSum)
//    val subArray = getSubArraySlidingWindow(arr, targetSum)
    val subArray = getSubArrayHashMap(arr, targetSum)
    print(subArray?.joinToString())
}

//time complexity O(n^2)
fun getSubArrayBruteForce(arr: IntArray, sum: Int): IntArray? {
    for (i in arr.indices) {
        var s = arr[i]
        if (s == sum) {
            return arr.copyOfRange(i, i + 1)
        }
        for (j in i + 1 until arr.size) {
            s += arr[j]
            if (s == sum) {
                return arr.copyOfRange(i, j + 1)
            }
        }
    }
    return null
}

fun getSubArraySlidingWindow(arr: IntArray, sum: Int): IntArray? {
    var c_sum = 0
    var start = 0
    for (i in arr.indices) {
        c_sum += arr[i]
        while (c_sum > sum && start < i) {
            c_sum -= arr[start]
            start++
        }
        if (sum == c_sum) {
            return arr.copyOfRange(start, i + 1)
        }
    }
    return null
}

fun getSubArrayHashMap(arr: IntArray, sum: Int): IntArray? {
    var c_sum = 0
    val map = HashMap<Int, Int>()
    for (i in arr.indices) {
        c_sum += arr[i]
        if (c_sum == sum) {
            return arr.copyOfRange(0, i + 1)
        }
        val diff = c_sum - sum
        if (map.contains(diff)) {
            val index = map[diff]!! + 1
            return arr.copyOfRange(index, i + 1)
        }
        map[c_sum] = i
    }
    return null
}