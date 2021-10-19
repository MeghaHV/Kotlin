//Armstrong number
fun main(){
    println("Enter the number:")
    val n= readLine()?.toInt()!!
    var temp= n
    var sum= 0
    var rem: Int
    while (temp != 0){
        rem= temp % 10
        sum= sum + (rem * rem * rem)
        temp= temp / 10
    }
    if(sum == n){
        println("$n is an armstrong number.")
    }else println("$n is not an armstrong number.")
}