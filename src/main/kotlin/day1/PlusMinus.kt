package day1

fun plusMinus(arr: Array<Int>): Unit {
    val positiveCount = arr.count { it > 0 }.toFloat()
    val negativeCount = arr.count { it < 0 }.toFloat()
    val totalCount = arr.size
    val zeroCount = totalCount - positiveCount - negativeCount
    val positiveRaio: Float = positiveCount / totalCount
    val negativeRaio: Float = negativeCount / totalCount
    val zeroRaio: Float = zeroCount / totalCount
    println(String.format("%.6f", positiveRaio))
    println(String.format("%.6f", negativeRaio))
    println(String.format("%.6f", zeroRaio))

}