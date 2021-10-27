//Delete the element from an array at a given position
fun main(){
val arr= mutableListOf(1,2,3,4,5,7)
println("Array: $arr")
println("Enter the position of the element to be deleted:")
val pos= readLine()?.toInt()!!
    if(pos<0 || pos>arr.lastIndex) {
        println("Invalid Position")
    }else {
        arr.removeAt(pos)
    }
println("Final array:")
for(i in 0..arr.lastIndex){
    print("${arr[i]} ")
}
}