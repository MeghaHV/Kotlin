fun main(){
    var t=0
    var exp=1
    println("Enter the base number, x:")
    val x=readLine()?.toInt()!!
    println("Enter the exponent value, y:")
    val y=readLine()?.toInt()!!

    while(t<y) {
     exp*=x
        t++
    }
    println("$x to the power $y = $exp")
}