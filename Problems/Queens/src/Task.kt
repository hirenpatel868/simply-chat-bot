import java.util.*
import kotlin.math.abs

fun main() {

    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()

    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    var result = "NO"
    if (x1 == x2 || y1 == y2) {
        result = "YES"                                // One has picked another
    }
    if (x1 == x2 || y1 == y2) {
        result = "YES"                                // Row or column
    }
    if (abs(x1 - x2) == abs(y1 - y2)) {
        result = "YES"                                // Diagonal
    }
    println(result)
}