class Transaction(
    var balance: Int,
    var add: Int,
    var reason: String,
    var spent: Int,
    var reason2: String,
    var balAdd: Int = balance + add,
    var balSpent: Int = balAdd - spent
)
