fun main() {
    println("Enter the alphabet:")
    val letter = readLine()!!
    if (letter.lastIndex != 0) {
        println("Invalid Input")
    } else {
        for (i in 'a'..'z') {
            if (i == letter[0]) {
                when (letter) {
                    "a", "e", "i", "o", "u" -> println("$letter is a vowel")
                    else -> println("$letter is a consonant")
                }
            }
        }
    }
}