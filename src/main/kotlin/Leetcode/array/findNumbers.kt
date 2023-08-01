package leetcode.array

fun main(args: Array<String>) {
    val arr = intArrayOf(12,345,2,6,7896)
    println(findNumbers(arr))
}

fun countDigits(num:Int):Int{
    var n=num
    var nCount=0
    while (n>0){
        nCount++
        n /= 10
    }
    return  nCount
}

fun findNumbers(nums: IntArray): Int {
    var count = 0
    for (i in 0..nums.lastIndex) {
        if ((countDigits(nums[i]) and 1) != 1) {
            count++
        }
    }
    return count
}