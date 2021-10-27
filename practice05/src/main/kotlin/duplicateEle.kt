
fun main(){
    println("Enter the number of elements of the array:")
    val n= readLine()?.toInt()!!
    println("Enter the elements of the array:")
    val arr=Array(n){ readLine()?.toInt()!!}

    for(i in 0..arr.lastIndex){
        for(j in i+1..arr.lastIndex){
            if(arr[i]==arr[j]){
                println("${arr[i]} repeats.")
                break
            }
        }
    }
}