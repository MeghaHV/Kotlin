fun main() {
    print("Enter the number of elements:")
    val n= readLine()?.toInt()!!
    println("Enter the elements:")
    val numArray=Array(n){readLine()!!}
    println("List of numbers:")
    println(numArray.toList())

    val numList:MutableList<String> = numArray.toMutableList()
    numList.sort()
    for(i in numList.indices){
        for(j in i+1..numList.lastIndex){
            if(numList[i]==numList[j]){
                numList.removeAt(j)
                numList.add("_")
            }
        }
    }
    print(numList)
}