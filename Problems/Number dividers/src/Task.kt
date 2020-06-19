import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    var result : String = ""
    if (num1 % 2 == 0) {
        result = "Divided by 2"
    }
    if (num1 % 3 == 0) {
        result = "$result\nDivided by 3"
    }
    if (num1 % 5 == 0) {
        result = "$result\nDivided by 5"
    }
    if (num1 % 6 == 0) {
        result = "$result\nDivided by 6"
    }
    println(result)
}