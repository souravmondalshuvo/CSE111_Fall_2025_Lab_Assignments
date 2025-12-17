/*
Task 1

Complete the class Cow so that the desired outputs are generated properly.

Given Code
public class AnimalTester2 {
  public static void main(String args[]){
    Animal a1 = new Animal();
    System.out.println("1-------------");
    a1.details();
    System.out.println("2-------------");
    Cow c1  = new Cow();
    c1.name = "Pammy";
    System.out.println("3-------------");
    System.out.println("Name: " + c1.getName());
    c1.details();
    System.out.println("4-------------");
    c1.updateSound("Moo");
    System.out.println("5-------------");
    c1.details();
  }
}

public class Animal{ 
  public int legs = 4;
  public String sound = "Not defined";
  
  public void details(){
    System.out.println("Legs: "+legs);
    System.out.println("Sound: "+sound);
  }
} 

public class Cow extends Animal{
    //Your Code Here
}

Expected Output
1-------------
Legs: 4
Sound: Not defined
2-------------
The cow says hello!
3-------------
Name: Pammy
Legs: 4
Sound: Not defined
4-------------
5-------------
Legs: 4
Sound: Moo
*/

public class AnimalTester2 {
    public static void main(String args[]) {
        Animal a1 = new Animal();
        System.out.println("1-------------");
        a1.details();
        System.out.println("2-------------");
        Cow c1 = new Cow();
        c1.name = "Pammy";
        System.out.println("3-------------");
        System.out.println("Name: " + c1.getName());
        c1.details();
        System.out.println("4-------------");
        c1.updateSound("Moo");
        System.out.println("5-------------");
        c1.details();
    }
}