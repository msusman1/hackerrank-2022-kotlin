package leetcode.array

import java.util.*

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 0, 2, 0, 3)
    duplicateZeros(arr)
    print(arr.joinToString())
}

fun duplicateZeros(arr: IntArray): Unit {
    val queue: Queue<Int> = LinkedList<Int>()

    for (index in arr.indices) {
        if (arr[index] == 0) {
            queue.add(0)
            queue.add(0)
        }else{
            queue.add(arr[index])
        }
        arr[index] = queue.poll()
    }
}

