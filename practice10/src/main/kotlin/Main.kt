/*Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target.*/

fun main() {
    print("Enter the number of elements:")
    val n= readLine()?.toInt()!!
    println("Enter the elements of the array:")
    val nums=Array(n){ readLine()?.toInt()!!}
    println("Enter the required sum:")
    val target= readLine()?.toInt()!!
    for(i in 0..nums.lastIndex){
        for(j in i+1..nums.lastIndex){
            if(nums[j]==target-nums[i]){
                println("[${nums[i]},${nums[j]}]")
                break
            }
        }
    }
}