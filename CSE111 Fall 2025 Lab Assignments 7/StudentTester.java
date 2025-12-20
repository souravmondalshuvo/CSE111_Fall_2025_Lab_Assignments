/*
Task 5

Given the following classes, write the code for the CSEStudent class derived from Student so that the following output is generated.

Given Code
public class StudentTester{
  public static void main (String args[]){
    CSEStudent.details();
    System.out.println("1--------------");
    CSEStudent s1 =  new CSEStudent("Bob", 23);
    s1.info();
    System.out.println("2--------------");
    CSEStudent s2 =  new CSEStudent("Don", 33);
    s2.info();
    System.out.println("3--------------");
    s1.addLabBasedCourse("CSE220");
    s1.addLabBasedCourse("CSE221");
    System.out.println("4--------------");
    s1.info();
    System.out.println("5--------------");
    CSEStudent.details();
    System.out.println("6--------------");
    s1.addLabBasedCourse("CSE230");
    System.out.println("7--------------");
    s1.info();
    System.out.println("8--------------");
    s2.addLabBasedCourse("CSE110");
    s2.info();
  }
}

class Student{
  public String name;
  public int id;
  public String courses = "";
  
  public Student(String n, int i){
    name = n;
    id = i;
  }
  
  public void info(){
    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("Courses: "+courses);
  }
}

Expected Output
Total CSE Students: 0
Available Lab Based Courses: 
CSE110 CSE111 CSE220 CSE221 
1--------------
Name: Bob
ID: 23
Courses: 
2--------------
Name: Don
ID: 33
Courses: 
3--------------
4--------------
Name: Bob
ID: 23
Courses: CSE220 CSE221 
5--------------
Total CSE Students: 2
Available Lab Based Courses: 
CSE110 CSE111 CSE220 CSE221 
6--------------
It is not a lab based course!
7--------------
Name: Bob
ID: 23
Courses: CSE220 CSE221 
8--------------
Name: Don
ID: 33
Courses: CSE110
*/

public class StudentTester {
    public static void main(String args[]) {
        CSEStudent.details();
        System.out.println("1--------------");
        CSEStudent s1 = new CSEStudent("Bob", 23);
        s1.info();
        System.out.println("2--------------");
        CSEStudent s2 = new CSEStudent("Don", 33);
        s2.info();
        System.out.println("3--------------");
        s1.addLabBasedCourse("CSE220");
        s1.addLabBasedCourse("CSE221");
        System.out.println("4--------------");
        s1.info();
        System.out.println("5--------------");
        CSEStudent.details();
        System.out.println("6--------------");
        s1.addLabBasedCourse("CSE230");
        System.out.println("7--------------");
        s1.info();
        System.out.println("8--------------");
        s2.addLabBasedCourse("CSE110");
        s2.info();
    }
}