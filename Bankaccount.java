import java.util.ArrayList;
import java.util.Scanner;

public class Bankaccount {
  private String accountNumber;
  private String accountHolderName;
  private double balance;
  
  public Bankaccount(String accountNumber, String accountHolderName, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
  }
  
  public String getAccountNumber() {
    return accountNumber;
  }
  
  public String getAccountHolderName() {
    return accountHolderName;
  }
  
  public double getBalance() {
    return balance;
  }
  
  public void applyInterest(double interestRate) {
    balance = balance * (1 + interestRate);
  }
  
  public static double getTotalBalance(ArrayList<Bankaccount> accountList) {
    double totalBalance = 0;
    for (Bankaccount account : accountList) {
      totalBalance += account.getBalance();
    }
    return totalBalance;
  }
  
  public static double getTotalInterest(ArrayList<Bankaccount> accountList, double interestRate) {
    double totalInterest = 0;
    for (Bankaccount account : accountList) {
      double interest = account.getBalance() * interestRate;
      totalInterest += interest;
      account.applyInterest(interestRate);
    }
    return totalInterest;
  }
  
  public static void printAccountBalance(ArrayList<Bankaccount> accountList, String accountHolderName) {
    for (Bankaccount account : accountList) {
      if (account.getAccountHolderName().equals(accountHolderName)) {
        System.out.println(account.getAccountNumber() + ": " + account.getBalance());
      }
    }
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    ArrayList<Bankaccount> accountList = new ArrayList<Bankaccount>();
    
    System.out.println("Enter number of accounts to add:");
    int numAccounts = scanner.nextInt();
    
    for (int i = 0; i < numAccounts; i++) {
      System.out.println("Enter account number:");
      String accountNumber = scanner.next();
      
      System.out.println("Enter account holder name:");
      String accountHolderName = scanner.next();
      
      System.out.println("Enter account balance:");
      double balance = scanner.nextDouble();
      
      accountList.add(new Bankaccount(accountNumber, accountHolderName, balance));
    }
    
    System.out.println("Enter interest rate:");
    double interestRate = scanner.nextDouble();
    
    double totalBalance = getTotalBalance(accountList);
    System.out.println("Total balance of all accounts: " + totalBalance);
    
    double totalInterest = getTotalInterest(accountList, interestRate);
    System.out.println("Total interest applied to all accounts: " + totalInterest);
    
    System.out.println("Enter account holder name to print balance:");
    String accountHolderName = scanner.next();
    printAccountBalance(accountList, accountHolderName);
    
    scanner.close();
  }
}
