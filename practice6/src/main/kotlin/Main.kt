//binary search

fun main() {
    println("Enter the number of elements:")
    val n = readLine()?.toInt()!!
    println("Enter the elements of the array:")
    val arr = Array(n) { readLine()?.toInt()!! }
    println("Enter the search element:")
    val ele = readLine()?.toInt()!!

    var high=n-1
    var mid:Int
    var low=0
    var pos=-1
    while(low<=high){
        mid=(low+high)/2
        if(arr[mid]==ele){
            pos=mid
            break
        }
        if(ele>arr[mid]){
            low=mid+1
        } else high=mid-1
    }
    if(pos<0){
        println("$ele not found.")
    } else
    println("$ele found at position ${pos+1}.")
}


