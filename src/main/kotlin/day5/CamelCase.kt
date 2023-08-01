package day5


fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    /* val scanner = Scanner(System.`in`)

     while (scanner.hasNext()) {
         val lines = scanner.nextLine()
         val res = convertTo(lines)
         println(res)
     }*/
    val list = listOf(
        "S;V;iPad",
        "C;M;mouse pad",
        "C;C;code swarm",
        "S;C;OrangeHighlighter",
    )
    list.forEach { lines ->
        val res = convertTo(lines)
        println(res)
    }
}


fun String.upcaseFirstChar(): String {
    return this.substring(0, 1).toUpperCase() + this.substring(1);
}

fun String.lowcaseFirstChar(): String {
    return this.substring(0, 1).toLowerCase() + this.substring(1);
}

fun String.upercaseToSpace(): String {
    val strBuilder = StringBuilder()
    forEachIndexed { index, char ->
        if (char.isUpperCase()) {
            if (index == 0) {
                strBuilder.append(char.toLowerCase())
            } else {
                strBuilder.append(" " + char.toLowerCase())
            }

        } else {
            strBuilder.append(char)
        }
    }
    return strBuilder.toString()
}

fun convertTo(str: String): Any {
    //conversion
    val (action, type, name) = str.split(";")
    val res = when (type) {
        "M" -> {
            if (action == "S") {
                name.upercaseToSpace().removeSuffix("()").toLowerCase()
            } else {
                val temp=name.split(" ").map { it.upcaseFirstChar() }.joinToString(separator = "") + "()"
                temp.lowcaseFirstChar()
            }
        }
        "V" -> {
            if (action == "S") {
                name.upercaseToSpace().toLowerCase()
            } else {
                name.split(" ").map { it.upcaseFirstChar() }.joinToString(separator = "").lowcaseFirstChar()
            }
        }
        else -> {
            if (action == "S") {
                name.upercaseToSpace().toLowerCase()
            } else {
                name.split(" ").map { it.upcaseFirstChar() }.joinToString(separator = "")
            }
        }
    }
    return res
}

