fun main() {
    println("Enter the year:")
    val year = readLine()?.toInt()!!
    if (year % 4 == 0) {
        if ((year % 4 == 0 && year%100!= 0) || year % 400 == 0) {
            println("$year is a leap year.")
        } else {
            println("$year is not a leap year.")
        }
    }
}