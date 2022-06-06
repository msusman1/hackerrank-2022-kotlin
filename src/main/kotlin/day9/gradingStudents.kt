package day9

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    val finalGrade = grades.map { grade ->
        val nextMultiple = next5Multiple(grade)
        if (grade % 5 == 0) {
            grade
        } else if (grade < 38) {
            grade
        } else if (nextMultiple - grade < 3) {
            nextMultiple
        } else {
            grade
        }
    }
    return finalGrade.toTypedArray()
}

fun next5Multiple(grade: Int): Int {
    val remeinder = (grade + 5) % 5
    val nextMultiple = grade + 5 - remeinder
    return nextMultiple
}

fun main(args: Array<String>) {
      val gradesCount = readLine()!!.trim().toInt()

      val grades = Array<Int>(gradesCount, { 0 })
      for (i in 0 until gradesCount) {
          val gradesItem = readLine()!!.trim().toInt()
          grades[i] = gradesItem
      }
//    val grades = arrayOf(73, 67, 38, 33)
    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}