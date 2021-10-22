fun main() {
print("Enter the number:")
    var n= readLine()?.toInt()!!
    var count=0
    while(n>0){
        n=n/10
        count++
    }
    println("The number of digits is $count")
}