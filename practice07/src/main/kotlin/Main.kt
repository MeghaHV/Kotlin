//ASCII value
fun main() {
  println("Enter any character:")
  val c = readLine()!![0]
  val ascii = c.code
  println("The ASCII value of $c is: $ascii")
}
