fun main(args: Array<String>) {
    val arr = intArrayOf(1, 3, 4, 6, 3, 5, 7, 7)
//    val newArr = cyclicRotateRight(arr)
//    val newArr = cyclicRotateLeft(arr)
//    val missingNumber = findMissingNumber(arr)
//    val countPairWithSum = countPairWithSumUsingHash(arr, 10)
    val findDuplicate = findDuplicate(intArrayOf(1, 2, 3, 3, 6, 1))
    println(findDuplicate.joinToString())
}

fun cyclicRotateRight(arr: IntArray): IntArray {
    val temp = arr.last()
    for (i in arr.size - 1 downTo 1) {
        arr[i] = arr[i - 1]
    }
    arr[0] = temp
    return arr
}

fun cyclicRotateLeft(arr: IntArray): IntArray {
    val temp = arr.first()
    for (i in 1 until arr.size) {
        arr[i - 1] = arr[i]
    }
    arr[arr.size - 1] = temp
    return arr
}

fun findMissingNumber(arr: IntArray): Int {
    val numberSet = arr.toHashSet()
    for (i in 1..arr.size + 1) {
        if (!numberSet.contains(i)) {
            return i
        }
    }
    return arr.last() + 1  // If no missing number is found
}

fun countPairWithSum(arr: IntArray, sum: Int): List<Pair<Int, Int>> {
    val list = mutableListOf<Pair<Int, Int>>()
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] + arr[j] == sum) {
                list.add(arr[i] to arr[j])
            }
        }
    }
    return list
}

fun countPairWithSumUsingHash(arr: IntArray, sum: Int): Int {
    val set = mutableSetOf<Int>() // number with its frequency
    var count = 0
    for (num in arr) {
        val complement = sum - num
        if (set.contains(complement)) {
            count += 1
        }
        set.add(num)
    }
    return count
}

fun findDuplicate(arr: IntArray): IntArray {
    val seen = mutableSetOf<Int>() // num with frequency
    val duplicates = mutableListOf<Int>() // num with frequency
    for (num in arr) {
        if (seen.contains(num)) {
            duplicates.add(num)
        } else {
            seen.add(num)
        }
    }
    return duplicates.toIntArray()
}