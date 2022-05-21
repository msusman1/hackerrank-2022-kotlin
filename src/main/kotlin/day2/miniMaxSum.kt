package day2


/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arrs: LongArray): Unit {
    val arr = arrs.toList()
    val min = arr.minOrNull() ?: 0
    val max = arr.maxOrNull() ?: 0
    val mins = arr - max
    val maxs = arr - min
    val minsSum = mins.sum()
    val maxSum = maxs.sum()
    print("$minsSum $maxSum")

}

public fun <T : Comparable<T>> Iterable<T>.maxOrNull(): T? {
    val iterator = iterator()
    if (!iterator.hasNext()) return null
    var max = iterator.next()
    while (iterator.hasNext()) {
        val e = iterator.next()
        if (max < e) max = e
    }
    return max
}

public fun <T : Comparable<T>> Iterable<T>.minOrNull(): T? {
    val iterator = iterator()
    if (!iterator.hasNext()) return null
    var min = iterator.next()
    while (iterator.hasNext()) {
        val e = iterator.next()
        if (min > e) min = e
    }
    return min
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toLongArray()

    miniMaxSum(arr)
}
