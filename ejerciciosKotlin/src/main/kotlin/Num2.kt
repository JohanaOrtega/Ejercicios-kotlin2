import java.util.*
import kotlin.Array as Array1

fun main() {

    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    val num = reader.nextInt()
    if (num % 2 == 0) {
        println("$num es par")
    } else {
        println("$num es impar")
    }
}