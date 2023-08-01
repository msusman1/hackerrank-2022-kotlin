package geekForGeek

fun main(args: Array<String>) {
    val arr = intArrayOf(3, 1, 4, 1, 2, 5)
//    val sorted = bubbleSort(arr)
//    val sorted = selectionSort(arr)
    val sorted = insertionSort(arr)
    println(sorted.joinToString())
}

fun insertionSort(arr: IntArray): IntArray {
    for (i in arr.indices) {

        val temp = arr[i]
        for (k in insertableIndex..i + 1) {
            arr[k] = arr[k + 1]
        }
        arr[insertableIndex] = temp
    }
    return arr
}


//select the min and swap with current position
fun selectionSort(arr: IntArray): IntArray {

    for (i in arr.indices) {
        var minIndex = i
        for (j in i + 1 until arr.size) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }
        val temp = arr[i]
        arr[i] = arr[minIndex]
        arr[minIndex] = temp
    }
    return arr
}


//for 2 d loop if
fun bubbleSort(arr: IntArray): IntArray {
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }
    return arr
}