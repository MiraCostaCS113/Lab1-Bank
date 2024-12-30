/*
 * Student.java
 */
// create Adult class that extends from Customer
public class Student extends Customer {

    public static final double SAVINGS_INTEREST = 0.04;
    public static final double CHECK_INTEREST = 0.01;
    public static final double CHECK_CHARGE = 0.02;
    public static final double OVERDRAFT_PENALTY = 25.0;

    /** Creates a new instance of Adult */

    public Student(String cName, String cAddress, int cAge, String cTelephoneNumber){
        super(cName, cAddress, cAge, cTelephoneNumber);
    }

    /** getter for getType return "Student" */
    public String getType(){
        return "Student";
    }

    /** getter for Savings Interest */
    public double getSavingsInterest(){
        return SAVINGS_INTEREST;
    }

    /** getter for Check Interest */
    public double getCheckInterest(){
        return CHECK_INTEREST;
    }
    /** getter for Check Charge */
    public double getCheckCharge(){
        return CHECK_CHARGE;
    }

    /** getter for OverdraftPenalty */
    public double getOverdraftPenalty(){
        return OVERDRAFT_PENALTY;
    }
}