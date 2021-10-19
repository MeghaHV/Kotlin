import kotlin.system.exitProcess

fun main() {
    while (true) {
    print("Enter the number:")
    val n = readLine()?.toInt()!!

        if (n % 2 == 1) {
            println("Weird")
        } else {
            if (n >= 6 && n <= 20) {
                println("Weird")
            } else{
                println("Not Weird")
            }
        }
    }
}
