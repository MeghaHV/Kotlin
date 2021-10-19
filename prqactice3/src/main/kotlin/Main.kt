/*Interchange the values of 2 variables without
using a third variable*/

fun main() {
  println("Enter the values of a and b:")
  print("a= ")
  var a= readLine()?.toInt()!!
  print("b= ")
  var b= readLine()?.toInt()!!

  a = a + b
  b = a - b
  a = a - b
  println("Values after interchanging: a=$a b=$b")
}