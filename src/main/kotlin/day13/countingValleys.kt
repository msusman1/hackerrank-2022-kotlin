import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */
enum class Level {
    SEA, ABOVE_SEA, BELOW_SEA
}

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var valliesVisted = 0
    var lastLevel = Level.SEA
    var downCount = 0
    var upCount = 0
    path.forEachIndexed { index, char ->
        if (char == 'D' && lastLevel == Level.SEA) {
            valliesVisted++
        }
        if (char == 'D') downCount++  else upCount++
        lastLevel = if (downCount > 0 && upCount > 0 && downCount == upCount) {
            Level.SEA
        } else if (char == 'D') {
            Level.BELOW_SEA
        } else {
            Level.ABOVE_SEA
        }

    }
    return valliesVisted
}

fun main(args: Array<String>) {
//    val steps = readLine()!!.trim().toInt()
//
//    val path = readLine()!!
    val steps = 8
    val path = "DDUUDDUDUUUD"
    val result = countingValleys(steps, path)

    println(result)
}