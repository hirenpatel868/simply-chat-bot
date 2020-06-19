import java.util.*
import javax.print.attribute.IntegerSyntax

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextLine()
    val num12 = Integer.parseInt(num)
    var result = 0
    for (i in 1..num12) {
        val ny = scanner.next()
        result += Integer.parseInt(ny)
    }
    println("$result")
}