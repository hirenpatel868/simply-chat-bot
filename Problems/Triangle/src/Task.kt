import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    // check condition
    if (a + b < c || a + c < b || b + c < a)
        println("YES")
    else
        println("NO")

}