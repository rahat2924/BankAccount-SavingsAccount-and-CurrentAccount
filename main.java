 abstract class BankAccount {
 public abstract void deposit(double
 amount);
 public abstract void
 withdraw(double amount);
 }
 class SavingsAccount extends
 BankAccount {
 // Implement methods for deposit
 and withdraw specific to savings
 account
 }
 class CurrentAccount extends
 BankAccount {
 // Implement methods for deposit
 and withdraw specific to current
account
 }
 public class Main {
 public static void main(String[]
 args) {
 // Code to test SavingsAccount
 and CurrentAccount classes
 }
 }
