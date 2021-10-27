fun main(){
    println("Enter the number:")
    var n= readLine()?.toInt()!!
    var r=0
    println("Reverse of the number = ")
    while(n!=0){
        r=n%10
        print(r)
        n=n/10
    }
}