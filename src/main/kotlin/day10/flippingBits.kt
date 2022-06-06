package day10

@kotlin.ExperimentalUnsignedTypes
fun flippingBits(n: Long): Long {
    // Write your code here
    val sd = n.toUInt().toString(radix = 2)
//    val sd=n.toUInt().toInt()   //"101101".toUInt(2)
    var finalStr = ""
    repeat(32 - sd.length) {
        finalStr += "0"
    }
    finalStr += sd
    val resultStr: String = finalStr.map { if (it == '0') '1' else '0' }.joinToString(separator = "")
    return resultStr.toULong(2).toLong()

}

fun main(args: Array<String>) {
      val q = readLine()!!.trim().toInt()

      for (qItr in 1..q) {
          val n = readLine()!!.trim().toLong()

          val result = flippingBits(n)

          println(result)
      }
//    val n = 1L
//    val result = flippingBits(n)

//    println(result)
}