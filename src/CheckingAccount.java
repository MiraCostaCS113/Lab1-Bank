/*
 * CheckingAccount.java
 *
 */

public class CheckingAccount extends Account{

    /** Creates a new instance of CheckingAccount using super */
    public CheckingAccount(Customer customer) {
        super(customer);
    }

    /***********************************************
     * Adds amount to balance
     * pre: amount must be a positive value
     * post: balance increases in amount value
     * @param amount double Deposit amount
     * @return double New account balance
     * add a new transaction to the transaction array. Use the customer number, 0 trantype, amount, and fee "DEP"
     * add the amount to the balance
     * add one to the tranIndex
     * return the balance
     */

    public double deposit(double amount){
        if(amount>0){
            Transaction transaction = new Transaction(customer.getCustomerNumber(), 0, amount, "DEP");
            transactions[tranIndex++] = transaction;
            this.balance = this.balance + amount;
        }
        return balance;
    }

    /***********************************************
     * Substracts amount from balance
     * pre: amount must be a positive value
     * post: balance decreases in amount value
     * @param amount double Withdrawal amount
     * @return double New account balance
     * create a new transaction and added to the transaction list. The new transaction will have the customer number, trantype = 0, amount = 0 , fees "CR"
     * add charge for using checking account to the amount from customer get check charge
     * if the amount is greater than the balance add and overdraft penalty fee from the customer overdraft penalty.
     * subtract the amount from the balance and return the balance, remeber to add 1 to the tranIndex
     */

    public double withdrawal(double amount){
        if(amount>0) {
            amount = amount + (amount * getCustomer().getCheckCharge());

            transactions[tranIndex++] = new Transaction(this.customer.getCustomerNumber(), 0, amount, "CR");
            if(amount > this.balance) {
                amount = amount + this.customer.getOverdraftPenalty();
            }
            this.balance = this.balance - amount;
        }
        return balance;
    }


    /***********************************************
     * Adds amount to balance
     * pre: amount must be a positive value
     * post: balance increases in amount value
     * @return double New account balance
     * amount = balance * customer's check interest
     * save the transation in to the transactions[tranIndex] as new transaction with customer number, trantype = 0, amount, and fees "INT"
     * add the amount to the balance and return the balance
     */
    public double addInterest(){
        double amount = balance*this.customer.getCheckInterest();
        transactions[this.tranIndex++] = new Transaction(this.customer.getCustomerNumber(), 0, amount, "INT");
        this.balance= this.balance + amount;
        return this.balance;
    }
}