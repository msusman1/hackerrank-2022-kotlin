package eximeJava

import kotlin.math.min

fun main(args: Array<String>) {
    val arr = listOf(2, 6, 4, 9, 3, 2)
    println(selectSort(arr.toMutableList()))
}

fun selectSort(arr: MutableList<Int>): MutableList<Int> {
    for (i in 0 until arr.size) {
        var minIndex = i
        for (j in i+1 until arr.size) {
            if (arr[j] < arr[i]) {
                minIndex = j
            }
        }
        val temp = arr[minIndex]
        arr[minIndex] = arr[i]
        arr[i] = temp
    }
    return arr
}