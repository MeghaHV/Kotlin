fun main(){
 val num= mutableListOf<Int>()
 println("Enter the number of elements:")
 val n= readLine()?.toInt()!!
    println("Enter $n elements:")
    for (i in 1..n){
        val ele= readLine()?.toInt()!!
        num.add(ele)
    }

    println("Reversed List:")
    for(i in n-1 downTo 0){
        print("${num[i]} ")
    }
}