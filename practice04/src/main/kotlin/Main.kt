//Sum of all the digits of the number
fun main(){
   println("Enter the number:")
    var n= readLine()?.toInt()!!
    var sum=0
    var rem=0
    while(n!=0){
        rem=n%10
        n=n/10
        sum+=rem
    }
    println("Sum of all digits of the number= $sum")
}