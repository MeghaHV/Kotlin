fun main(){
    val n=readLine()?.toInt()!!
    if(n in 2..20){
        for(i in 1..10){
            println("$n * $i = ${n*i}")
        }
    } else println("Invalid Input")
}