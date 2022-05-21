

fun timeConversion(ampmTime: String): String {
    // Write your code here
   val isPm = ampmTime.endsWith("PM")
    val justTime = ampmTime.removeRange(ampmTime.length - 2, ampmTime.length)
    val (hour, min, sec) = justTime.split(":")

    val hourIn24 = if (isPm) {
        if (hour == "12") {
            "12"
        } else {
            "${12 + hour.toInt()}"
        }
    } else {
        if (hour == "12") {
            "00"
        } else {
            hour
        }
    }
    val final=hourIn24+":"+min+":"+sec
    return final
}
fun main(args: Array<String>) {
    val ampmTime = "07:05:45PM"
    val timeIn24 = timeConversion(ampmTime)
    println(timeIn24)
}
