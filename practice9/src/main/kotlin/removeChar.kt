//remove characters which are not alphabets
fun main(){
    print("Enter a string:")
    val string= readLine()!!
    for(i in 0..string.lastIndex){
        when(string[i]){
           in 'a'..'z' -> print(string[i])
            else -> print("")
        }
    }
}