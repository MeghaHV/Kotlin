fun main(){
    val check= checkBrackets()
    println(check)
}

fun checkBrackets(): Boolean {
    val input = readLine()!!
    val brackets = mapOf(')' to '(', '}' to '{', ']' to '[')
    val checklist = arrayListOf<Char>()
    for (i in input) {
        if (i in brackets.values) {
            checklist.add(i)
        } else if(checklist.size==0||brackets.get(i)!=checklist.removeAt(checklist.size-1)){
            return false
        }
    }
        return checklist.isEmpty()
}