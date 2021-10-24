fun main(){
print("Enter a string:")
    val string= readLine()!!
    for(i in 0..string.length-1){
        when(string[i]){
            'a','e','i','o','u' -> print(string[i])
            else -> print("#")
        }
    }
}