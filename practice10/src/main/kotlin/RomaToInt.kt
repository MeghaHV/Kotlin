//Converting roman number to integer

fun main(){
    println("Enter the Roman number:")
    val romanNum= readLine()?.uppercase()!!
    val romanChart= mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var i=0
    var intNum=0
    while(i<romanNum.length){
        if(i==romanNum.length-1){
            intNum+= romanChart[romanNum[i]]!!
            break
        }
        if(romanChart[romanNum[i]]!! < romanChart[romanNum[i+1]]!!){
                intNum+=romanChart[romanNum[i+1]]!!-romanChart[romanNum[i]]!!
            i+=2
        }
        else{
            intNum+= romanChart[romanNum[i]]!!
            i++
        }
    }
    println(intNum)
}