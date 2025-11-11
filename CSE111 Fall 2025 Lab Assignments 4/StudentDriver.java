/* 
Task 2

Write  “Student“ class to show the following expected outputs
Note:
A student can’t take any course until the CGPA is set.
A student cannot take more than 4 courses.
A student with CGPA below 3 cannot take more than 3 courses.

Driver Code
public class StudentDriver {
  public static void main(String[] args){
    Student student1 = new Student(12345678);
    System.out.println("1-----------------");
    student1.addCourse("CSE110");
    System.out.println("2-----------------");
    student1.storeCG(2.5);
    student1.addCourse("CSE110");
    student1.addCourse("ENG101");
    student1.showAdvisee();
    System.out.println("3-----------------");
    student1.removeAllCourse();
    student1.showAdvisee();
    System.out.println("4-----------------");
    student1.storeID(54652365);
    String[] courses = {"SOC101","CSE111","ENG102"};
    student1.addCourse(courses);
    student1.showAdvisee();
    System.out.println("5-----------------");
    student1.addCourse("CSE230");
    student1.showAdvisee();
    System.out.println("6-----------------");
    Student student2 = new Student(975738383,3.7);
    System.out.println("7-----------------");
    String[] courses2 = {"CSE220","PHY112","MAT120","BUS101","CHN101"};
    student2.addCourse(courses2);
    student2.showAdvisee();
  }
}

Expected Output
A student with ID 12345678 has been created.
1-----------------
Failed to add CSE110
Set CG first
2-----------------
Student ID: 12345678, CGPA: 2.5
Added courses are:
CSE110 ENG101 
3-----------------
Student ID: 12345678, CGPA: 2.5
No courses added.
4-----------------
Student ID: 54652365, CGPA: 2.5
Added courses are:
SOC101 CSE111 ENG102 
5-----------------
Failed to add CSE230
CG is low. Can't add more than 3 courses.
Student ID: 54652365, CGPA: 2.5
Added courses are:
SOC101 CSE111 ENG102 
6-----------------
A student with ID 975738383 and cgpa 3.7 has been created.
7-----------------
Failed to add CHN101
Maximum 4 courses allowed.
Student ID: 975738383, CGPA: 3.7
Added courses are:
CSE220 PHY112 MAT120 BUS101
*/

public class StudentDriver {
  public static void main(String[] args){
    Student student1 = new Student(12345678);
    System.out.println("1-----------------");
    student1.addCourse("CSE110");
    System.out.println("2-----------------");
    student1.storeCG(2.5);
    student1.addCourse("CSE110");
    student1.addCourse("ENG101");
    student1.showAdvisee();
    System.out.println("3-----------------");
    student1.removeAllCourse();
    student1.showAdvisee();
    System.out.println("4-----------------");
    student1.storeID(54652365);
    String[] courses = {"SOC101","CSE111","ENG102"};
    student1.addCourse(courses);
    student1.showAdvisee();
    System.out.println("5-----------------");
    student1.addCourse("CSE230");
    student1.showAdvisee();
    System.out.println("6-----------------");
    Student student2 = new Student(975738383,3.7);
    System.out.println("7-----------------");
    String[] courses2 = {"CSE220","PHY112","MAT120","BUS101","CHN101"};
    student2.addCourse(courses2);
    student2.showAdvisee();
  }
}