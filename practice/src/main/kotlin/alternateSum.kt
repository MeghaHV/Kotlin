fun main(){
    val num= mutableListOf<Int>()
    println("Enter the number of elements:")
    val n= readLine()?.toInt()!!
    println("Enter $n elements:")
    for (i in 1..n){
        val ele= readLine()?.toInt()!!
        num.add(ele)
    }
    var sum1=0

    for(i in 1..n step 2){
        sum1+=i
    }
    println("The alternating sum1 is: $sum1")

    var sum2=0
    for(i in 2..n step 2){
        sum2+=i
    }
    println("The alternating sum2 is: $sum2")
}