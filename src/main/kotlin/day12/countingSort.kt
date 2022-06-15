package day12

/*
 * Complete the 'countingSort' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun countingSort(arr: Array<Int>): Array<Int> {
    // Write your code here
    val intRange = (0..100).toList().dropLast(1).map { 0 }.toTypedArray()
    arr.forEach {
        intRange[it] = intRange[it] + 1
    }
    return intRange

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
//    val arr = arrayOf(1, 2, 3, 4, 5, 4)
    val result = countingSort(arr)
    println(result.joinToString(" "))
}
