/*
Task 2

Design the CheckingAccount class derived from the Account class with appropriate attributes and properties so that the driver code can generate the output given below. 

Driver Code and Parent Class 
public class Account{
  public double balance = 0.0;
  
  public Account(double balance){
    this.balance = balance;
  }
  public double showBalance(){
    return balance;
  }
}
 
//Tester Class
public class TestAccount{
  public static void main(String [] args){
    System.out.println("Total Checking Accounts: "+CheckingAccount.count);
    CheckingAccount c1 = new CheckingAccount();
    System.out.println("Account Balance: " + c1.showBalance());
    CheckingAccount c2 = new CheckingAccount(100.0);
    System.out.println("Account Balance: " + c2.showBalance());
    CheckingAccount c3 = new CheckingAccount(200.0);
    System.out.println("Account Balance: " + c3.showBalance());
    System.out.println("Total Checking Accounts: "+CheckingAccount.count);
  }
}
 
Output
Total Checking Accounts: 0
Account Balance: 0.0
Account Balance: 100.0
Account Balance: 200.0
Total Checking Accounts: 3
*/

public class TestAccount {
  public static void main(String[] args) {
    System.out.println("Total Checking Accounts: " + CheckingAccount.count);
    CheckingAccount c1 = new CheckingAccount();
    System.out.println("Account Balance: " + c1.showBalance());
    CheckingAccount c2 = new CheckingAccount(100.0);
    System.out.println("Account Balance: " + c2.showBalance());
    CheckingAccount c3 = new CheckingAccount(200.0);
    System.out.println("Account Balance: " + c3.showBalance());
    System.out.println("Total Checking Accounts: " + CheckingAccount.count);
  }
}