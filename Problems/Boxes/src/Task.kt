import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val z1 = scanner.nextInt()

    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val z2 = scanner.nextInt()

    if (x1 == x2 && y1 == y2 && z1 == z2) {
        println("Box 1 = Box 2")
    } else if (x1 < x2 && y1 < y2 && z1 < z2) {
        println("Box 1 < Box 2")
    } else if (x1 > x2 && y1 > y2 && z1 > z2) {
        println("Box 1 > Box 2")
    }


}