fun main() {

    val a = Transaction(45000, 3500, "Salary", 12000, "Rent",)
    val b = Transaction(a.balSpent, 5000, "Savings", 1000, "Bill",)
    val c = Transaction(b.balSpent, 5000, "Salary", 5000, "Dress",)
    val d = Transaction(c.balSpent, 3000, "Savings", 1000, "Food")
    val userList: MutableList<Transaction> = mutableListOf(a,b,c,d)
    println("--- Personal Transaction Record ---")
    println("Balance Add  Reason Add_bal Spent Reason Spent_bal")
    print(userList)
}

    fun print(userList: List<Transaction>){
       for(i in userList){
           println("${i.balance}  ${i.add}  ${i.reason}  ${i.balAdd}  ${i.spent}  ${i.reason2}  ${i.balSpent}")
       }
    }

