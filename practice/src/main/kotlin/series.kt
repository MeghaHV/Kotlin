import java.lang.Math
import kotlin.math.pow

fun main(){
    val a=readLine()?.toDouble()!!
    val b=readLine()?.toDouble()!!
    val n=readLine()?.toDouble()!!
    var sum=a

        for(i in 0..n.toInt()-1){
            sum=sum + b* (Math.pow(2.0, i.toDouble()))
            print("${sum.toInt()} ")
        }
    }
