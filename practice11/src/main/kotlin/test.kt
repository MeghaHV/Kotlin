fun main(){
    val input = readLine()!!
    val brackets = mapOf(')' to '(', '}' to '{', ']' to '[')
    for (i in input) {
        if (i in brackets.values) {
            print(i)
        }
        }
}