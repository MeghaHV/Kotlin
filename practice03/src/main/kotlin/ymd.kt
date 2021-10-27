//Converting to years, months and days

fun main(){
 println("Enter the number of days:")
    val n= readLine()?.toInt()!!
    val years:Int
    val months:Int
    val days:Int
    val r:Int
    years=n/365
    r=n%365
    months=r/30
    days=months%30
    println("$years year/s $months month/s $days day/s")
}