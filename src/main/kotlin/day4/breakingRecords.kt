package day4

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var maxScore = scores.first()
    var minScore = scores.first()
    var maxCount = 0
    var minCount = 0
    scores.forEach {
        if (it > maxScore) {
            maxScore = it
            maxCount++
        } else if (it < minScore) {
            minScore = it
            minCount++
        }
    }
    return arrayOf(maxCount, minCount)
}
fun main(args: Array<String>) {
    val arr = arrayOf(12,24,10,24,25,7)
    val result = breakingRecords(arr)
    println(result.joinToString(" "))
}
