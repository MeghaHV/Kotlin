//longest prefix

fun main() {
    print("Enter the number of elements:")
    val n = readLine()?.toInt()!!
    println("Enter the elements:")
    val strs=Array(n){ readLine()!!}
    println("\nThe longest prefix is:")
    var prefix=strs[0]
    for(i in 1..strs.lastIndex){
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)
        }
    }
    if(prefix.isEmpty()){
        println("No common prefix found")
    }
    print(prefix)
}
