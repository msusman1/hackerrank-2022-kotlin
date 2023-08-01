package leetcode.intro

import day2.maxOrNull

fun main(args: Array<String>) {
    val accounts = arrayOf(intArrayOf(1, 4, 7, 9, 99), intArrayOf(1, 4, 7, 9, 99), intArrayOf(1, 4, 7, 9, 99))
    println(maximumWealth(accounts))
}


fun maximumWealth(accounts: Array<IntArray>): Int {
    return accounts.map { it.sum() }.maxOrNull() ?: 0
}



