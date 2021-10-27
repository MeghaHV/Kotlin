
//1+x+x^2+x^3+x^4+....x^n
fun main(){
    println("Enter the value of x:")
    val x= readLine()?.toDouble()!!
    print("Enter the number n:")
    val n= readLine()?.toDouble()!!
    var sum= 0.0
    for(i in 0..n.toInt()){
       sum+= Math.pow(x,i.toDouble())
    }
    println("Sum of the series=${sum.toInt()}")
}
