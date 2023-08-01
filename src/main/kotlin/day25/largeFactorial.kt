package day25

import java.math.BigDecimal
import java.math.BigInteger
import java.util.Hashtable

fun extraLongFactorials(n: Int): Unit {
    // Write your code here
    val f: BigDecimal = fact(n.toBigDecimal())
    print(f)

}

tailrec fun fact(n: BigDecimal, ac: BigDecimal = BigDecimal.ONE): BigDecimal {
    val soFar: BigDecimal = n * ac
    println("$n*$ac=$soFar")
    return if (n <= BigDecimal.ONE) {
        soFar
    } else {
        fact(n - BigDecimal.ONE, soFar)
    }
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()
    val n = 25
    val containers = arrayOf(
        arrayOf(0, 2, 1),
        arrayOf(1, 1, 1),
        arrayOf(2, 0, 0)
    )
//    print(organizingContainers(containers))
    val hasp=Hashtable<String,String>()
    hasp[""] = ""
    hasp[null] = ""
}

fun organizingContainers(container: Array<Array<Int>>): String {
    // Write your code here
    val c_c = container.map { it.sum() }
    val t_c = arrayListOf<Int>()
    for (i in container.indices) {
        var sum = 0
        for (j in container[i].indices) {
            sum += container[j][i]
        }
        t_c.add(sum)
    }
    val sortedc = c_c.sorted()
    val sortedt = t_c.sorted()
    var found = "Possible"
    for (i in sortedc.indices) {
        if (sortedc[i] != sortedt[i]) {
            found = "Impossible"
            break
        }

    }
    return found
}