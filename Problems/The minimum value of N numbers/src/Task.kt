import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val ct = scanner.nextInt()
    var min = Int.MAX_VALUE
    repeat(ct) {
        val curr = scanner.nextInt()
        if (curr < min) {
            min = curr
        }
    }
    println(min)
    // write your code here
}
