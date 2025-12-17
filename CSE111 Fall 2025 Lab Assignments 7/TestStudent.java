/*
Task 2
Given the following classes, write the code for the BBAStudent class so that the following output is printed when we run the TestStudent class.

Driver Code and Parent Class 
public class TestStudent{
  public static void main(String [] args){
    BBAStudent b1 = new BBAStudent();
    BBAStudent b2 = new BBAStudent("Humty Dumty");
    BBAStudent b3 = new BBAStudent("Little Bo Peep"); 
    b1.details();
    System.out.println("1---------------");
    b2.details();
    System.out.println("2---------------");
    b3.details();
  }
}

public class Student{
  private String name = "Just a Student"; 
  private String department = "nothing";
  
  public void setDepartment(String dpt){
    this.department = dpt;
  }
  public void setName(String name){
    this.name = name;
  }
  public void details(){
    System.out.println("Name : " + name + " Department: " + department);
  }
}

Output
Name: Default Department: BBA
1---------------
Name: Humty Dumty Department: BBA
2---------------
Name: Little Bo Peep Department: BBA
*/

public class TestStudent {
    public static void main(String[] args) {
        BBAStudent b1 = new BBAStudent();
        BBAStudent b2 = new BBAStudent("Humty Dumty");
        BBAStudent b3 = new BBAStudent("Little Bo Peep");
        b1.details();
        System.out.println("1---------------");
        b2.details();
        System.out.println("2---------------");
        b3.details();
    }
}