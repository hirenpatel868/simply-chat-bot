import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val elements = scanner.nextInt()
    val numbers = ArrayList<Int>()

    repeat(elements) {
        val number = scanner.nextInt()
        if (number % 4 == 0) {
            numbers.add(number)
        }
    }
    println(numbers.max())
}