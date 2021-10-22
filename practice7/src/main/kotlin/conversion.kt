fun main(){
    println("Enter the measurement in inches:")
    var m= readLine()?.toInt()!!
    val yards = m/432
    m=m%432
    val feet = m/12
    val inches = m%12
    println("$yards yards $feet feet $inches inches")

}