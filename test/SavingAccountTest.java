import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {

    @Test
    public void shouldInitializeAdultSavingsAccountWithZeroBalance() {
        // Arrange
        Customer accountHolder = new Adult("John Doe", "123 Main Street", 30, "555-555-1234");
        //Act
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder);
        // Assert
        Assertions.assertEquals(0, savingsAccount.getBalance(), "Initial balance should be zero.");
    }


    @Test
    public void shouldInitializeStudentSavingsAccountWithZeroBalance() {
        // Arrange
        Customer accountHolder = new Student("John Doe", "123 Main Street", 30, "555-555-1234");
        //Act
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder);
        // Assert
        Assertions.assertEquals(0, savingsAccount.getBalance(), "Initial balance should be zero.");
    }
    @Test
    public void shouldInitializeSeniorAdultSavingsAccountWithZeroBalance() {
        // Arrange
        Customer accountHolder = new Senior("John Doe", "123 Main Street", 30, "555-555-1234");
        //Act
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder);
        // Assert
        Assertions.assertEquals(0, savingsAccount.getBalance(), "Initial balance should be zero.");
    }

    @Test
    public void validateDepositToAdultSavingAccount() {
        //Arrange
        Customer accountHolder = new Adult("John Doe", "123 Main Street", 30, "555-555-1234");
        //Act
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder);
        savingsAccount.deposit(100);
        //Assert
        Assertions.assertEquals(103, savingsAccount.getBalance(), "Balance should be 103.");
    }

    @Test
    public void validateDepositToSeniorSavingAccount() {
        //Arrange
        Customer accountHolder = new Senior("John Doe", "123 Main Street", 30, "555-555-1234");
        //Act
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder);
        savingsAccount.deposit(100);
        //Assert
        Assertions.assertEquals(104, savingsAccount.getBalance(), "Balance should be 104.");
    }

    @Test
    public void validateDepositToStudentSavingAccount() {
        //Arrange
        Customer accountHolder = new Student("John Doe", "123 Main Street", 30, "555-555-1234");
        //Act
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder);
        savingsAccount.deposit(100);
        //Assert
        Assertions.assertEquals(104, savingsAccount.getBalance(), "Balance should be 104.");
    }

    @Test
    public void validateWithdrawFromAdultSavingAccount() {
        //Arrange
        Customer accountHolder = new Adult("John Doe", "123 Main Street", 30, "555-555-1234");
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder);
        savingsAccount.deposit(100);
        //Act
        savingsAccount.withdrawal(50);
        //Assert
        Assertions.assertEquals(53, savingsAccount.getBalance(), "Balance should be 53.");
    }

    @Test
    public void validateWithdrawFromStudentSavingAccount() {
        //Arrange
        Customer accountHolder = new Student("John Doe", "123 Main Street", 30, "555-555-1234");
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder);
        savingsAccount.deposit(100);
        //Act
        savingsAccount.withdrawal(50);
        //Assert
        Assertions.assertEquals(54, savingsAccount.getBalance(), "Balance should be 54.");
    }

    @Test
    public void validateWithdrawFromSeniorSavingAccount() {
        //Arrange
        Customer accountHolder = new Senior("John Doe", "123 Main Street", 30, "555-555-1234");
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder);
        savingsAccount.deposit(100);
        //Act
        savingsAccount.withdrawal(50);
        //Assert
        Assertions.assertEquals(54, savingsAccount.getBalance(), "Balance should be 54.");
    }

}