open class BankAccount(
    public val accountHolderName: String,
    internal val bankName: String,
    private var balance: Double
) {
    
    protected fun showBalance() {
        println("Account Holder: $accountHolderName")
        println("Bank Name: $bankName")
        println("Balance: $balance")
    }
}

class SavingsAccount(
    accountHolderName: String,
    bankName: String,
    balance: Double
) : BankAccount(accountHolderName, bankName, balance) {

    fun displayBalance() {
        println("Accessing protected function from subclass:")
        showBalance()
    }
}

fun main() {
    val savingsAccount = SavingsAccount("Sarika Khoje", "SBI Bank", 15000.0)
    savingsAccount.displayBalance()
}
