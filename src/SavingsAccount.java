/*
 * SavingsAccount.java
 *
 */
public class SavingsAccount extends Account{

    /** Creates a new instance of SavingsAccount */
    public SavingsAccount(Customer customer) {
        super(customer);
    }


    /***********************************************
     * Adds amount to balance
     * pre: amount must be a positive value
     * post: balance increases in amount value
     * @param amount double Deposit amount
     * @return double New account balance
     */
    public double deposit(double amount){
        if(amount>0){
            // add an new transation to the array transactions with customer number, 0 trantyp, amount, fees "DEP"
            Transaction transaction = new Transaction(this.customer.getCustomerNumber(), 0, amount, "DEP");
            // add the amount to the balance
            this.balance = this.balance + amount;
            // call the addinterest method
            this.addInterest();
            // add one to the tranIndex
            transactions[tranIndex++] = transaction;
        }
        // return balance
        return balance;

    }

    /***********************************************
     * Substracts amount from balance
     * pre: amount must be a positive value
     * post: balance decreases in amount value
     * @param amount double Withdrawal amount
     * @return double New account balance
     */
    public double withdrawal(double amount){
        if(amount > 0 ) {
            // add an new transation to the array transactions with customer number, 0 trantyp, amount, fees "CR"
            Transaction transaction = new Transaction(this.customer.getCustomerNumber(),0,amount,"CR");
            // subtract the amount from the balance
            this.balance = this.balance  - amount;

            // add one to the tranIndex
            transactions[tranIndex++] = transaction;
        }

        // return the balance
        return this.balance;

    }
    /***********************************************
     * Adds amount to balance
     * pre: amount must be a positive value
     * post: balance increases in amount value
     * @return double New account balance
     */
    public double addInterest(){
        // create an amount from the balance times the customer savings interest
        double amount = this.balance *this.customer.getSavingsInterest();
        if (amount >0) {
            // add an new transation to the array transactions with customer number, 0 trantyp, amount, fees "CR"
            Transaction transaction = new Transaction(this.customer.getCustomerNumber(),0,amount,"CR");

            // add the amount to the balance
            this.balance = this.balance + amount;

            // add one to the tranIndex
            transactions[tranIndex++] = transaction;
        }
        // return the balance
        return balance;

    }
}