package leetcode.intro

fun main(args: Array<String>) {
    println(numberOfSteps(32))
}

fun numberOfSteps(num: Int): Int {
    var n = num
    var steps = 0
    while (n > 0) {
        if (n % 2 == 0) {
            n /= 2
        } else {
            n--
        }
        steps++
    }
    return steps

}
