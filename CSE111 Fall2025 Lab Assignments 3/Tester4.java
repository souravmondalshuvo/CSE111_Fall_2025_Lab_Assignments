/*
Task 4

You are building a tracker system that will keep track of a person’s income and expenses. 
When the createTracker() method is invoked it sets the balance to 1.0 taka.
The info() method returns a String with the trackers information.
If the total balance becomes 0 after the expense() method is called it prints “You’re broke!” . Again if the available balance is less than the expense it prints “Not enough balance.”. Otherwise the method prints “Balance updated” after updating the balance.
The last expense and income history can be seen by using the history() method.

Driver Code
public class Tester4{
 public static void main(String[] args) {
    MoneyTracker tr1 = new MoneyTracker();
    System.out.println(tr1.info());
    tr1.createTracker("John");
    System.out.println("1 ==========");
    System.out.println(tr1.info());
    System.out.println("2 ==========");
    tr1.income(1000);
    System.out.println(tr1.info());
    System.out.println("3 ==========");
    tr1.expense(800);
    tr1.expense(100);
    System.out.println(tr1.info());
    System.out.println("4 ==========");
    tr1.showHistory();
    System.out.println("5 ==========");
    tr1.expense(101);
    System.out.println("6 ==========");
    tr1.expense(200);
    System.out.println("7 ==========");
    tr1.income(200);
    tr1.showHistory();
    System.out.println("8 ==========");
 }
}

Output
A new money tracker has been launched. 
Name: null
Current Balance: 0.0
1 ==========
Name: John
Current Balance: 1.0
2 ==========
Balance Updated!
Name: John
Current Balance: 1001.0
3 ==========
Balance Updated.
Balance Updated.
Name: John
Current Balance: 101.0
4 ==========
Last added: 1000.0
Last spent: 100.0
5 ==========
You're broke!
6 ==========
Not enough balance.
7 ==========
Balance Updated!
Last added: 200.0
Last spent: 101.0
8 ==========
*/

//HomeWorkTask04

class MoneyTracker {
    
    public String name;
    public double balance;
    public double last_income;
    public double last_expense;

    public MoneyTracker() {
        System.out.println("A new money tracker has been launched.");
        this.balance = 0.0;
    }

    public void createTracker(String name) {
        this.name = name;
        this.balance = 1.0;
    }

    public void income(double blnce) {
        balance += blnce;
        last_income = blnce;
        System.out.println("Balance Updated!");
    }

    public void expense(double blnce) {
        if(blnce == this.balance) {
            this.balance = 0.0;
            last_expense = blnce;
            System.out.println("You're broke!");
        } else if(blnce > this.balance) {
            System.out.println("Not enough balance.");
        } else {
            this.balance -= blnce;
            last_expense = blnce;
            System.out.println("Balance Updated.");
        }
    }

    public void showHistory() {
        System.out.println("Last added: " + last_income);
        System.out.println("Last spent: " + last_expense);
    }

    public String info() {
        return "Name: " + this.name + "\nCurrent Balance: " + this.balance;
    }
}

public class Tester4{
 public static void main(String[] args) {
    MoneyTracker tr1 = new MoneyTracker();
    System.out.println(tr1.info());
    tr1.createTracker("John");
    System.out.println("1 ==========");
    System.out.println(tr1.info());
    System.out.println("2 ==========");
    tr1.income(1000);
    System.out.println(tr1.info());
    System.out.println("3 ==========");
    tr1.expense(800);
    tr1.expense(100);
    System.out.println(tr1.info());
    System.out.println("4 ==========");
    tr1.showHistory();
    System.out.println("5 ==========");
    tr1.expense(101);
    System.out.println("6 ==========");
    tr1.expense(200);
    System.out.println("7 ==========");
    tr1.income(200);
    tr1.showHistory();
    System.out.println("8 ==========");
 }
}