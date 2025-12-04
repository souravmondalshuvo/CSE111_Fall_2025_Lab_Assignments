/* 
Task 1

Design the Company and Employee classes so that the Tester1 class produces the given outputs.
Restriction: Company class can’t have more than 1 array. 

Driver Code
public class Tester1{
  public static void main(String args[]){
    Employee e1 = new Employee();
    Employee e2 = new Employee("Alif", 34, "Fulltime");
    System.out.println("1-------------");
    Company c1 = new Company();
    c1.details();
    System.out.println("2-------------");
    Employee e3 = new Employee("Akter", 36,"Part-time");
    Employee e4 = new Employee("Ria", 38, "Fulltime");
    System.out.println("3-------------");
    c1.addEmployee(e2);
    c1.addEmployee(e3);
    System.out.println("4-------------");
    c1.details();
    System.out.println("5-------------");
    c1.addEmployee(e4);
    c1.addEmployee(e1);
    System.out.println("6-------------");
    c1.details();
    System.out.println("7-------------");
    c1.removeEmployee(e4);
    System.out.println("6-------------");
    c1.details();
  }
}

Output
A default employee has been created
1-------------
Company Name: ABC Company
Total Employee: 0
Fulltime Employees: 
Part-Time Employees: 
2-------------
3-------------
Alif has joined the company
Akter has joined the company
4-------------
Company Name: ABC Company
Total Employee: 2
Fulltime Employees: 
Name: Alif, ID: 34
Part-Time Employees: 
Name: Akter, ID: 36
5-------------
Ria has joined the company
No more vacancy
6-------------
Company Name: ABC Company
Total Employee: 3
Fulltime Employees: 
Name: Alif, ID: 34
Name: Ria, ID: 38
Part-Time Employees: 
Name: Akter, ID: 36
7-------------
Ria has left the company
6-------------
Company Name: ABC Company
Total Employee: 2
Fulltime Employees: 
Name: Alif, ID: 34
Part-Time Employees: 
Name: Akter, ID: 36
*/

public class Tester1{
  public static void main(String args[]){
    Employee e1 = new Employee();
    Employee e2 = new Employee("Alif", 34, "Fulltime");
    System.out.println("1-------------");
    Company c1 = new Company();
    c1.details();
    System.out.println("2-------------");
    Employee e3 = new Employee("Akter", 36,"Part-time");
    Employee e4 = new Employee("Ria", 38, "Fulltime");
    System.out.println("3-------------");
    c1.addEmployee(e2);
    c1.addEmployee(e3);
    System.out.println("4-------------");
    c1.details();
    System.out.println("5-------------");
    c1.addEmployee(e4);
    c1.addEmployee(e1);
    System.out.println("6-------------");
    c1.details();
    System.out.println("7-------------");
    c1.removeEmployee(e4);
    System.out.println("6-------------");
    c1.details();
  }
}