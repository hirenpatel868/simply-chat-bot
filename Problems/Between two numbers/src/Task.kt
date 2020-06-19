import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()

    val result: Boolean = num1 in num2..num3 && num2 < num3
    println("$result")
}