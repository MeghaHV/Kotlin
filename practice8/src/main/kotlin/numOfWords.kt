fun main(){
    print("Enter a sentence:")
    val sentence: String= readLine()!!
    val len=sentence.length
    var count=0
    for(i in 0..len-1){
        if(sentence[i] == ' '){
            count++
        }
    }
    println("The number of words in the above sentence is ${count+1}")
}