fun main(){
    val myList= mutableListOf(0,1)
    println("Enter the number:")
    val n= readLine()?.toInt()!!
    for(i in 0..n-3){
        myList.add(myList[i] + myList[i+1])
    }
    println(myList)
}