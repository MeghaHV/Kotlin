//1!+2!+3!+....n!
fun main(){
    println("Enter the number n:")
    val n= readLine()?.toInt()!!
    var product=1
    var sum=0
    for(i in 1..n){
        product*=i
        sum+=product
    }
    println("Sum of the series = $sum")
}