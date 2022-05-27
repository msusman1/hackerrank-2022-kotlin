package day7

fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    // Write your code here
    val list = Array(queries.size){0}
    queries.forEachIndexed { index, query ->
        list.set(index, strings.filter { it == query }.count())
    }
    return list
}

fun main(args: Array<String>) {
      val stringsCount = readLine()!!.trim().toInt()

      val strings = Array<String>(stringsCount, { "" })
      for (i in 0 until stringsCount) {
          val stringsItem = readLine()!!
          strings[i] = stringsItem
      }

      val queriesCount = readLine()!!.trim().toInt()

      val queries = Array<String>(queriesCount, { "" })
      for (i in 0 until queriesCount) {
          val queriesItem = readLine()!!
          queries[i] = queriesItem
      }


  /*  val strings = arrayOf(
        "abcde",
        "sdaklfj",
        "asdjf",
        "na",
        "basdn",
        "sdaklfj",
        "asdjf",
        "na",
        "asdjf",
        "na",
        "basdn",
        "sdaklfj",
        "asdjf"
    )

    val queries = arrayOf(
        "abcde",
        "sdaklfj",
        "asdjf",
        "na",
        "basdn",
    )*/
    val res = matchingStrings(strings, queries)

    println(res.joinToString("\n"))
}