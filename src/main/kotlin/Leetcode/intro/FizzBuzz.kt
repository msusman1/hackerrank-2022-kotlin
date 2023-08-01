package leetcode.intro

fun main(args: Array<String>) {
    println(fizzBuzz(32))
}

fun fizzBuzz(n: Int): List<String> {
    return (1..n).map { index ->
        when {
            index % 15 == 0 -> "FizzBuzz"
            index % 3 == 0 -> "Fizz"
            index % 5 == 0 -> "Buzz"
            else -> "$index"
        }

    }
}