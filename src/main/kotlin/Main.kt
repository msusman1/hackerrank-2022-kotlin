import java.lang.StringBuilder

fun main(args: Array<String>) {
    val data = listOf("mal 1 2 3", "Uman 4 5 6")
    print(newList(data))
}

fun newList(data: List<String>): String {
    val strinBuilder = StringBuilder()
    for (datum in data) {
        val split: List<String> = datum.split(" ")
        val jusNames=split.filter { it.isNumber().not() }
        val justNumbers: List<Int> = split.mapNotNull { it.toIntOrNull() }
        val name = jusNames.joinToString(separator = " ")
        val average = justNumbers.average().toInt()
        strinBuilder.append(name).append("-").append(average).append(";")
    }
    return strinBuilder.toString()
}
fun String.isNumber(): Boolean {
    return toIntOrNull() != null
}


