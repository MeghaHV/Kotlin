//Insert an element into an array at the given position
fun main() {
    val arr= mutableListOf(1,2,3,4,5,7)
    println("Array: $arr")
    println("Enter the element to be inserted:")
    val ele= readLine()?.toInt()!!
    println("Enter the position:")
    val pos= readLine()?.toInt()!!
    if(pos<0 || pos>arr.lastIndex) {
        println("Invalid Position")
    }
    else{
        arr.add(pos,ele)
            }
    println("Final array:")
    for(i in 0..arr.lastIndex){
        print("${arr[i]} ")
    }
}