fun main(){
    print("Enter the number of elements:")
    val n= readLine()?.toInt()!!
    println("Enter the elements of the array: ")
    val numArray=IntArray(n){ readLine()?.toInt()!!}
    var carry = 0


        numArray[numArray.lastIndex]+=1
        if(numArray[numArray.lastIndex]>9){
            carry=1
            numArray[numArray.lastIndex]=0
        }

        for(i in numArray.lastIndex-1 downTo 0) {
            if (carry == 1) {
                numArray[i] += 1
                if (numArray[i] >= 10) {
                    carry = 1
                    numArray[i] = numArray[i]%10
                }
                else{
                    carry=0
                }
            }
        }
    for (j in 0..numArray.lastIndex){
        print("${numArray[j]} ")
    }
    }