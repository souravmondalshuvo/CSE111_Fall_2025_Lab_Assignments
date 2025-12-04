/*
Task 2

Design the Student and Department class with the necessary properties so that the provided driver code generates the output given below. For simplicity, assume that a department can add a maximum of 5 students. 

Driver Code
public class DepartmentTester {
 public static void main(String[] args) {
  Student s1 = new Student("Akib", 10, 3.29);
  Student s2 = new Student("Reza", 15, 3.45);
  Student s3 = new Student("Kabir", 20,4.0);
  System.out.println("1===========");
  Department cse = new Department("CSE");
  cse.findStudent(-100);
  System.out.println("2===========");
  cse.addStudent(s1, s2, s3);
  System.out.println("3===========");
  cse.details();
  System.out.println("4===========");
  cse.findStudent(15);
  System.out.println("5===========");
  Student s4 = new Student("Nakib", 15,3.22);
  cse.addStudent(s4);
  System.out.println("6===========");
  s4.updateId(25);
  cse.addStudent(s4);  
  System.out.println("7===========");
  cse.details();
  System.out.println("8===========");
  Student s5 = new Student("Sakib", 30,2.29);
  cse.addStudent(s5);
  System.out.println("9===========");
  cse.details();
 }
}

Output
1===========
Student with this ID doesn't exist, Please give a valid ID
2===========
Welcome to CSE department, Akib
Welcome to CSE department, Reza
Welcome to CSE department, Kabir
3===========
Department Name: CSE
Number of student:3
Details of the students: 
Student name: Akib, ID: 10, cgpa: 3.29
Student name: Reza, ID: 15, cgpa: 3.45
Student name: Kabir, ID: 20, cgpa: 4.0
4===========
Student info:
Student Name: Reza
ID: 15
CGPA:  3.45
5===========
Student with the same ID already exists, Please try with another ID
6===========
Welcome to CSE department, Nakib
7===========
Department Name: CSE
Number of student:4
Details of the students: 
Student name: Akib, ID: 10, cgpa: 3.29
Student name: Reza, ID: 15, cgpa: 3.45
Student name: Kabir, ID: 20, cgpa: 4.0
Student name: Nakib, ID: 25, cgpa: 3.22
8===========
Welcome to CSE department, Sakib
9===========
Department Name: CSE
Number of student:5
Details of the students: 
Student name: Akib, ID: 10, cgpa: 3.29
Student name: Reza, ID: 15, cgpa: 3.45
Student name: Kabir, ID: 20, cgpa: 4.0
Student name: Nakib, ID: 25, cgpa: 3.22
Student name: Sakib, ID: 30, cgpa: 2.29
*/

public class DepartmentTester {
    public static void main(String[] args) {
        Student s1 = new Student("Akib", 10, 3.29);
        Student s2 = new Student("Reza", 15, 3.45);
        Student s3 = new Student("Kabir", 20, 4.0);
        System.out.println("1===========");
        Department cse = new Department("CSE");
        cse.findStudent(-100);
        System.out.println("2===========");
        cse.addStudent(s1, s2, s3);
        System.out.println("3===========");
        cse.details();
        System.out.println("4===========");
        cse.findStudent(15);
        System.out.println("5===========");
        Student s4 = new Student("Nakib", 15, 3.22);
        cse.addStudent(s4);
        System.out.println("6===========");
        s4.updateId(25);
        cse.addStudent(s4);
        System.out.println("7===========");
        cse.details();
        System.out.println("8===========");
        Student s5 = new Student("Sakib", 30, 2.29);
        cse.addStudent(s5);
        System.out.println("9===========");
        cse.details();
    }
}