import java.util.*

fun main(args: Array<String>) {

    var perfect = 0
    var fix = 0
    var reject = 0

    val scanner = Scanner(System.`in`)
    val inp = scanner.nextLine()
    val partNo = Integer.parseInt(inp)
    repeat(partNo) {
        val product = scanner.nextLine()
        val pp = Integer.parseInt(product)
        when {
            pp == 0 -> {
                perfect++
            }
            pp == 1 -> {
                fix++
            }
            pp == -1 -> {
                reject++
            }
        }
    }
    println("$perfect $fix $reject")
}