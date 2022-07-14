fun main() {
    val border = "'-._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, Jhansi!")
    printBorder(border, timesToRepeat)
}
fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat){
    print(border)
    }
    println()
}
// fun main() {
//     printBorder()
//     println("Happy Birthday, Jhansi!")
//     printBorder()
// }

// fun printBorder() {
//     repeat(23) {
//         print("=")
//     }
//     println()
// }