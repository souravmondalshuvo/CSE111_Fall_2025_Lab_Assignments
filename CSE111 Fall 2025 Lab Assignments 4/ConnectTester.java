/* 
Task 3

Design the Student and the Connect class so that the following output is produced.
Note:
A student's email, password, and login status are null by default while creating an object of the Student class.
Your code should satisfy the conditions mentioned in the output only.
Connect class will have two instance variables: totalAdvisee and an array of Student type to store the student object. The array will be updated inside the advising() method only when the advising is successful.
Connect can take at most 5 advisees.

Driver Code
public class ConnectTester {
  public static void main(String[] args) {
    Student rakib = new Student("Rakib", 12301455, "CSE");
    Student roy = new Student("Roy", 12501345, "CS");
    System.out.println("1*************");
    Connect connectObj = new Connect();
    System.out.println("2*************");
    connectObj.login(rakib);
    System.out.println("3*************");
    connectObj.advising(rakib);
    System.out.println("4*************");
    rakib.email = "rakib@hotmail.com";
    rakib.password = "1234";
    System.out.println("5*************");
    connectObj.login(rakib);
    System.out.println("6*************");
    connectObj.advising(rakib);
    System.out.println("7*************");
    connectObj.advising(rakib, "CSE110", "PHY111", "MAT110", "CSE260");
    System.out.println("8*************");
    connectObj.advising(rakib, "CSE110", "PHY111","MAT110");
    System.out.println("9*************");
    connectObj.allAdviseeInfo();
    System.out.println("10*************");
    roy.email = "roy@hotmail.com";
    roy.password = "abcd";
    connectObj.login(roy);
    System.out.println("11*************");
    connectObj.advising(roy, "CSE110", "ENG101", "PHY112");
    System.out.println("12*************");
    connectObj.allAdviseeInfo();
  }
}

Expected Output
Student object is created
Student object is created
1*************
Connect is ready to use!
2*************
Email and password need to be set.
3*************
Please login to advise courses!
4*************
5*************
Login successful
6*************
You haven't selected any courses.
7*************
You need special approval to take more than 3 courses.
8*************
Advising successful!
9*************
Total Advisee: 1
Name: Rakib ID: 12301455
Department: CSE
Advised Courses: 
CSE110 PHY111 MAT110 
==============
10*************
Login successful
11*************
Advising successful!
12*************
Total Advisee: 2
Name: Rakib ID: 12301455
Department: CSE
Advised Courses: 
CSE110 PHY111 MAT110 
==============
Name: Roy ID: 12501345
Department: CS
Advised Courses: 
CSE110 ENG101 PHY112 
==============
*/

public class ConnectTester {
  public static void main(String[] args) {
    Student rakib = new Student("Rakib", 12301455, "CSE");
    Student roy = new Student("Roy", 12501345, "CS");
    System.out.println("1*************");
    Connect connectObj = new Connect();
    System.out.println("2*************");
    connectObj.login(rakib);
    System.out.println("3*************");
    connectObj.advising(rakib);
    System.out.println("4*************");
    rakib.email = "rakib@hotmail.com";
    rakib.password = "1234";
    System.out.println("5*************");
    connectObj.login(rakib);
    System.out.println("6*************");
    connectObj.advising(rakib);
    System.out.println("7*************");
    connectObj.advising(rakib, "CSE110", "PHY111", "MAT110", "CSE260");
    System.out.println("8*************");
    connectObj.advising(rakib, "CSE110", "PHY111","MAT110");
    System.out.println("9*************");
    connectObj.allAdviseeInfo();
    System.out.println("10*************");
    roy.email = "roy@hotmail.com";
    roy.password = "abcd";
    connectObj.login(roy);
    System.out.println("11*************");
    connectObj.advising(roy, "CSE110", "ENG101", "PHY112");
    System.out.println("12*************");
    connectObj.allAdviseeInfo();
  }
}