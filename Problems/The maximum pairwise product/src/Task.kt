import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numN = scanner.nextInt()
    var  max = Int.MAX_VALUE
    var  min = Int.MAX_VALUE
    repeat(numN){

         val curr = scanner.nextInt()
         if(max > curr){
             max = curr
         }else{
          min = curr
         }
    }

    println(min*max)
    // write your code here
}