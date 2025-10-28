/*
Task 3

Create an Employee class to provide the expected output.

An employee will have a name, salary and designation.
The name will be assigned inside the newEmployee() method
Whenever a New Employee joins his/her salary will be Tk. 30,000 and the designation will be junior.
Employees with salaries greater than Tk. 50,000 and Tk. 30,000 need to pay 30% and 10% of salary as tax respectively.
Employees can be promoted to senior, lead and manager positions. Based on their promotion they will get an increment of Tk. 25,000, Tk. 50,000 and Tk. 75,000 respectively.

Driver Code

public class Tester9{
  public static void main(String[] args){

    Employee emp1 = new Employee();
    Employee emp2 = new Employee();
    Employee emp3 = new Employee();
      
    emp1.newEmployee("Harry Potter");
    emp2.newEmployee("Hermione Granger");
    emp3.newEmployee("Ron Weasley");
    System.out.println("1 ==========");
    emp1.displayInfo();
    System.out.println("2 ==========");
    emp2.displayInfo();
    System.out.println("3 ==========");
    emp3.displayInfo();
    System.out.println("4 ==========");
    emp1.calculateTax();
    System.out.println("5 ==========");
    emp1.promoteEmployee("lead");
    System.out.println("6 ==========");
    emp1.calculateTax();
    System.out.println("7 ==========");
    emp1.displayInfo();
    System.out.println("8 ==========");
    emp3.promoteEmployee("manager");
    System.out.println("9 ==========");
    emp3.calculateTax();
    System.out.println("10 ==========");
    emp3.displayInfo();
  }
}

Expected Output

1 ==========
Employee Name: Harry Potter
Employee Salary: 30000.0 Tk
Employee Designation: junior
2 ==========
Employee Name: Hermione Granger
Employee Salary: 30000.0 Tk
Employee Designation: junior
3 ==========
Employee Name: Ron Weasley
Employee Salary: 30000.0 Tk
Employee Designation: junior
4 ==========
No need to pay tax
5 ==========
Harry Potter has been promoted to lead
New Salary: 80000.00 Tk
6 ==========
Harry Potter Tax Amount: 24000.0 Tk
7 ==========
Employee Name: Harry Potter
Employee Salary: 80000.0 Tk
Employee Designation: lead
8 ==========
Ron Weasley has been promoted to manager
New Salary: 105000.00 Tk
9 ==========
Ron Weasley Tax Amount: 31500.0 Tk
10 ==========
Employee Name: Ron Weasley
Employee Salary: 105000.0 Tk
Employee Designation: manager
*/

//HomeWorkTask03

class Employee {
    public String name;
    public double salary = 30000.0;
    public String designation = "junior";

    public void newEmployee(String nm) {
        this.name = nm;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
        System.out.println("Employee Designation: " + this.designation);
    }

    public void calculateTax() {
        if (salary > 50000) {
            double tax = salary * 0.30;
            System.out.println(this.name + " Tax Amount: " + tax + "Tk");
        } else if (salary == 30000) {
            System.out.println("No need to pay tax");
        } else {
            double tax = salary * 0.10;
            System.out.println(this.name + " Tax Amount: " + tax + "Tk");
        }
    }

    public void promoteEmployee(String designation) {
        double increment = 0.0;
        String lowerCase = designation.toLowerCase();

        if (lowerCase.equals("senior")) {
            increment = 25000.0;
        } else if (lowerCase.equals("lead")) {
            increment = 50000.0;
        } else if (lowerCase.equals("manager")) {
            increment = 75000.0;
        }

        salary += increment;
        this.designation = lowerCase;

        System.out.println(this.name + " has been promoted to " + designation);
        System.out.println("New Salary: " + salary + "Tk");
    }
}

public class Tester9{
  public static void main(String[] args){

    Employee emp1 = new Employee();
    Employee emp2 = new Employee();
    Employee emp3 = new Employee();
      
    emp1.newEmployee("Harry Potter");
    emp2.newEmployee("Hermione Granger");
    emp3.newEmployee("Ron Weasley");
    System.out.println("1 ==========");
    emp1.displayInfo();
    System.out.println("2 ==========");
    emp2.displayInfo();
    System.out.println("3 ==========");
    emp3.displayInfo();
    System.out.println("4 ==========");
    emp1.calculateTax();
    System.out.println("5 ==========");
    emp1.promoteEmployee("lead");
    System.out.println("6 ==========");
    emp1.calculateTax();
    System.out.println("7 ==========");
    emp1.displayInfo();
    System.out.println("8 ==========");
    emp3.promoteEmployee("manager");
    System.out.println("9 ==========");
    emp3.calculateTax();
    System.out.println("10 ==========");
    emp3.displayInfo();
  }
}
