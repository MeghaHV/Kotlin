fun main() {
    while (true) {
        print("Enter the number:")
        val n = readLine()?.toInt()!!

        if (n % 2 == 1) {
            println("Weird")
        } else {
            if (n in 6..20) {
                println("Weird")
            } else{
                println("Not Weird")
            }
        }
    }
}

