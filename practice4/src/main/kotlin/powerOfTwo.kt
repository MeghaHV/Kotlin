//Power of 2
fun main() {
    println("Enter the number:")
    var n = readLine()?.toInt()!!

        while (n > 2) {
            if (n % 2 == 1) {
                break
            }
            n = n / 2
        }
        if (n==2) {
            println("Power of 2.")
        } else println("Not a power of 2.")
    }
