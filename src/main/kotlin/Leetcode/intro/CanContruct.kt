package leetcode.intro

fun main(args: Array<String>) {
    println(canConstruct("aac", "aab"))
}
//check whether the magazine string can be made from characters from ransom String
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    var tempMagzine = magazine
    for (char in ransomNote) {
        if (tempMagzine.contains(char)) {
            tempMagzine = tempMagzine.replaceFirst(char.toString(), "")
        } else {
            return false
        }
    }
    return true


}