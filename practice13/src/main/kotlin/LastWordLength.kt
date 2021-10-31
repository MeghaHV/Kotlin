/*Given a string s consisting of some words separated by some
number of spaces, return the length of the last word in the string.*/

fun main() {
    println("Enter a sentence:")
    val sentence = readLine()!!
    var count = 0
    var i = sentence.lastIndex

    while(sentence[i]==' '){
        sentence.replace(" ","")
        i--
    }

    while(sentence[i]!=' '){
            count++
        i--
    }
    println("Length of the last word: $count")
}