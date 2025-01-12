/*
 * Customer.java
 *
 */
public abstract class Customer {
    private String name;
    private String address;
    private int age;
    private String telephoneNumber;
    private String customerNumber;
    protected static int custNumber = 0;

    /** Creates a new instance of Customer */


    public Customer(String name, String address, int age, String telephoneNumber){
        this.name = name;
        this.address = address;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
        custNumber = custNumber + 1;
        this.customerNumber = String.format("C%010d",++custNumber);
    }




    /**
     * Return the type of customer.
     * @return the type of customer
     */
    public abstract String getType();


    /*******************************************
     * Returns customer's name
     * @return String customer's name
     */
    public String getName(){
        return this.name;
    }


    /*******************************************
     * Returns customer's address
     * @return String customer's address
     */
    public String getAddress(){
        return this.address;
    }

    /*******************************************
     * Returns customer's age
     * @return int customer's age
     */
    public int getAge(){
        return this.age;
    }

    /*******************************************
     * Returns customer's phone number
     * @return String customer's phone number
     */
    public String getTelephoneNumber(){
        return this.telephoneNumber;
    }

    /*******************************************
     * Returns customer's number
     * @return String customer's number
     */
    public String getCustomerNumber(){
        return this.customerNumber;
    }

    /*******************************************
     * Changes customer's name
     * pre: name must be a not null string
     * post: customer's name changes to name
     * @param name New name
     */
    public void setName(String name){
        this.name = name;
    }

    /*******************************************
     * Changes customer's address
     * pre: address must be a not null string
     * post: customer's address changes to address
     * @param address New address
     */
    public void setAddress(String address){
        this.address = address;
    }

    /*******************************************
     * Changes customer's age
     * pre: age must be a positive value
     * post: customer's age changes to age
     * @param age New age
     */
    public void setAge(int age){
        this.age = age;
    }

    /*******************************************
     * Changes customer's phone number
     * pre: phone number must be a not null string
     * post: customer's phone number changed to phoneNumber
     Programming Project Solutions
     * @param telephoneNumber New number
     */
    public void setTelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }

    /*******************************************
     * Changes customer's number
     * pre: customerNumber must be a not null string
     * post: customer's number changes to customerNumber
     * @param customerNumber New customer number
     */
    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }

    public abstract double getSavingsInterest();
    public abstract double getCheckInterest();
    public abstract double getCheckCharge();
    public abstract double getOverdraftPenalty();

}