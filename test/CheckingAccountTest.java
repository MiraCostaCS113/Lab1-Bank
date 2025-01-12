import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckingAccountTest {

    @Test
    public void shouldInitializeAdultSavingsAccountWithZeroBalance() {
        // Arrange
        Customer accountHolder = new Adult("John Doe", "123 Main Street", 30, "555-555-1234");
        //Act
        CheckingAccount checkingAccount = new CheckingAccount(accountHolder);
        // Assert
        Assertions.assertEquals(0, checkingAccount.getBalance(), "Initial balance should be zero.");
    }


    @Test
    public void shouldInitializeStudentCheckingAccountWithZeroBalance() {
        // Arrange
        Customer accountHolder = new Student("John Doe", "123 Main Street", 30, "555-555-1234");
        //Act
        CheckingAccount checkingAccount = new CheckingAccount(accountHolder);
        // Assert
        Assertions.assertEquals(0, checkingAccount.getBalance(), "Initial balance should be zero.");
    }
    @Test
    public void shouldInitializeSeniorAdultCheckingAccountWithZeroBalance() {
        // Arrange
        Customer accountHolder = new Senior("John Doe", "123 Main Street", 30, "555-555-1234");
        //Act
        CheckingAccount checkingAccount = new CheckingAccount(accountHolder);
        // Assert
        Assertions.assertEquals(0, checkingAccount.getBalance(), "Initial balance should be zero.");
    }

    @Test
    public void validateDepositToAdultCheckingAccount() {
        //Arrange
        Customer accountHolder = new Adult("John Doe", "123 Main Street", 30, "555-555-1234");
        //Act
        CheckingAccount checkingAccount = new CheckingAccount(accountHolder);
        checkingAccount.deposit(100);
        //Assert
        Assertions.assertEquals(100, checkingAccount.getBalance(), "Balance should be 100.");
    }

    @Test
    public void validateDepositToSeniorCheckingAccount() {
        //Arrange
        Customer accountHolder = new Senior("John Doe", "123 Main Street", 30, "555-555-1234");
        //Act
        CheckingAccount checkingAccount = new CheckingAccount(accountHolder);
        checkingAccount.deposit(100);
        //Assert
        Assertions.assertEquals(100, checkingAccount.getBalance(), "Balance should be 100.");
    }

    @Test
    public void validateDepositToStudentCheckingAccount() {
        //Arrange
        Customer accountHolder = new Student("John Doe", "123 Main Street", 30, "555-555-1234");
        //Act
        CheckingAccount checkingAccount = new CheckingAccount(accountHolder);
        checkingAccount.deposit(100);
        //Assert
        Assertions.assertEquals(100, checkingAccount.getBalance(), "Balance should be 100.");
    }

    @Test
    public void validateWithdrawFromAdultCheckingAccount() {
        //Arrange
        Customer accountHolder = new Adult("John Doe", "123 Main Street", 30, "555-555-1234");
        CheckingAccount checkingAccount = new CheckingAccount(accountHolder);
        checkingAccount.deposit(100);
        //Act
        checkingAccount.withdrawal(50);
        //Assert
        Assertions.assertEquals(50, checkingAccount.getBalance(), "Balance should be 50.");
    }

    @Test
    public void validateWithdrawFromStudentCheckingAccount() {
        //Arrange
        Customer accountHolder = new Student("John Doe", "123 Main Street", 30, "555-555-1234");
        CheckingAccount checkingAccount = new CheckingAccount(accountHolder);
        checkingAccount.deposit(100);
        //Act
        checkingAccount.withdrawal(50);
        //Assert
        Assertions.assertEquals(50, checkingAccount.getBalance(), "Balance should be 50.");
    }

    @Test
    public void validateWithdrawFromSeniorCheckingAccount() {
        //Arrange
        Customer accountHolder = new Senior("John Doe", "123 Main Street", 30, "555-555-1234");
        CheckingAccount checkingAccount = new CheckingAccount(accountHolder);
        checkingAccount.deposit(100);
        //Act
        checkingAccount.withdrawal(50);
        //Assert
        Assertions.assertEquals(50, checkingAccount.getBalance(), "Balance should be 050.");
    }

}