/*Given an integer array numArray, find the contiguous subarray
 (containing at least one number) which has the largest sum and return its sum.*/

fun main() {
    print("Enter the number of elements:")
    val n= readLine()?.toInt()!!
    println("Enter the numbers:")
    val numArray=Array(n){ readLine()?.toInt()!!}
    var maxSum = numArray[0]
    var num = numArray[0]

    for (i in 1 until numArray.size) {
        val nextNum = num + numArray[i]
        if(numArray[i]>nextNum){
                num = numArray[i]
            }
        else num = nextNum

        if(num > maxSum){
            maxSum = num
        }
    }
  println(maxSum)
}

