fun main(){
  var temp=false
  println("Enter the number of elements:")
  val n= readLine()?.toInt()!!
  println("Enter the elements:")
  val arr:Array<Int> =Array<Int>(n){readLine()?.toInt()!!}
  println("Enter the search element:")
    val searchEle= readLine()?.toInt()
    for(i in 0..arr.lastIndex) {
      if (searchEle == arr[i]) {
        temp = true
      }
    }
      if(temp){
        println("$searchEle found")
      }else{
        println("$searchEle not found")
      }
}