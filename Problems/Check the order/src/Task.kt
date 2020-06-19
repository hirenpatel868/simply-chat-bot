import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val arr = IntArray(num)
    repeat(num) { i: Int ->
        arr[i] = scanner.nextInt()
    }
    if (arraySortingTest(arr, num))
        System.out.print("YES\n");
    else
        System.out.print("NO\n");
}

fun arraySortingTest(arr: IntArray, len: Int): Boolean {

    // Array has one or no element
    if (len == 0 || len == 1) return true

    for (i in 1 until len)  // Unsorted pair found
        if (arr[i - 1] > arr[i]) return false

    return true
}