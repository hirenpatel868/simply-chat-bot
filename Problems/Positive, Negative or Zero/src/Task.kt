import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    when {
        num1 > 0 -> {
            println("positive")
        }
        num1 < 0 -> {
            println("negative")
        }
        else -> {
            println("zero")
        }
    }
    // write your code here
}