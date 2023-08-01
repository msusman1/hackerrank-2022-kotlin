package day27

import kotlin.math.pow
import kotlin.math.tan

fun main(args: Array<String>) {

//    println(checkBitPosition(n = 10, pos = 2))
//    println(sumDigitsUsingRecursion(n = 12345))
//    println(reverseOfNumber(n = 12345))
//    println(reverseOfNumberUsingRecursion(n = 12345))
//    println(findBiggest(i = 1, j = 2, k = 3))
//    println(last2Largest())
//    println(getFactors())
    val arr = intArrayOf(2,14,19,19,5,13,18,10,15,20)
    val num = arr.fold(initial = 1) { acc, i -> acc * i }
    println(num)
    println(getPrimeFactor(num = num))
}

/*
check bit at given position is set or not
 */
fun checkBitPosition(n: Int, pos: Int): Boolean {
    var num = n
    var str = ""
    while (num > 0) {
        val rem = num % 2
        num /= 2
        str += rem.toString()
    }
    val binaryNumber = str.reversed()
    return binaryNumber[1] == '1'
}

/*
get Sum of digits in number
 */
fun sumDigits(n: Int): Int {
    var sum = 0
    var num = n;
    while (num > 0) {
        val rem = num % 10
        num /= 10
        sum += rem
    }
    return sum
}

/*
get Sum of digits in number using recursion
 */
fun sumDigitsUsingRecursion(n: Int): Int {
    return if (n == 0) {
        0
    } else {
        val rem = n % 10
        rem + sumDigitsUsingRecursion(n / 10)
    }
}

/*
find reverse of number
 */
fun reverseOfNumber(n: Int): Int {
    var num = n
    var final = 0

    while (num > 0) {
        val rem = num % 10
        val remCount = getCount(num) - 1
        final += rem * Math.pow(10.0, remCount.toDouble()).toInt()
        num /= 10
    }
    return final
}

/*
find reverse of number using recursion
 */
fun reverseOfNumberUsingRecursion(n: Int): Int {
    val num = n
    if (num == 0) {
        return 0
    } else {
        val rem = num % 10
        val remCount = getCount(num) - 1
        return rem * Math.pow(10.0, remCount.toDouble()).toInt() + reverseOfNumberUsingRecursion(n / 10)
    }
}

/*
get no of digits in number
 */
fun getCount(n: Int): Int {
    var num = n;
    var count = 0
    while (num > 0) {
        count++
        num /= 10
    }
    return count
}

/*
find biggest of three numbers
 */
fun findBiggest(i: Int, j: Int, k: Int): Int {
    return if (i > j && i > k) {
        i
    } else if (j > k) {
        j
    } else {
        k
    }
}

fun last2Largest(): Pair<Int, Int> {
    val arr = intArrayOf(1, 2, 3, 4, 5, 2)
    arr.sorted().get(arr.size - 1)
    var l1 = arr.get(0)
    var l2 = arr.get(1)
    for (i in arr) {
        if (i > l1) {
            l2 = l1
            l1 = i
        } else if (i > l2 && i != l1) {
            l2 = i
        }
    }
    return l1 to l2

}

fun getFactors() {
    val n = 1248;
    val digits = getDigits(n)
    val total = digits.count { n % it == 0 }
    println(total)
}

fun getDigits(n: Int): List<Int> {
    var num = n;
    val list = mutableListOf<Int>()
    while (num > 0) {
        val rem = num % 10
        num /= 10
        list.add(rem)
    }
    return list
}

fun getPrimeFactor(num: Int): MutableList<Int> {
    var n = num;
    var start = 2
    val list = mutableListOf<Int>()
    while (n > 1) {
        if (n % start == 0) {
            list.add(start)
            n /= start
        } else {
            start++
        }
    }
    return list
}