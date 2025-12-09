/*
Task 2

Design the Character class such that it produces the following output.

Tester Code
public class WeirderStuffTester {
  public static void main(String[] args) {
    Character.printStats();
    System.out.println("---------1-----------");
    Character twelve = new Character("Twelve", "Kid", 100);
    twelve.printDetails();
    System.out.println("---------2-----------");
    Character spike = new Character("Spike", "Kid", 50);
    spike.printDetails();
    System.out.println("---------3-----------");
    Character.printStats();
    System.out.println("---------4-----------");
    Character reeve = new Character("Reeve", 70);
    reeve.printDetails();
    System.out.println("---------5-----------");
    Character chopper = new Character("Chopper", "Adult", 120);
    chopper.printDetails();
    System.out.println("---------6-----------");
    Character.printStats();
  }
}

Output
Total Characters: 0
Kids: 0
Teens: 0
Adults: 0
Average Health: 0
Strongest Character: None
---------1-----------
ID: 1, Name: Twelve
Group: Kid
Health: 100
---------2-----------
ID: 2, Name: Spike
Group: Kid
Health: 50
---------3-----------
Total Characters: 2
Kids: 2
Teens: 0
Adults: 0
Average Health: 75.0
Strongest Character: 
Twelve (Health 100)
---------4-----------
ID: 3, Name: Reeve
Group: Teen
Health: 70
---------5-----------
ID: 4, Name: Chopper
Group: Adult
Health: 120
---------6-----------
Total Characters: 4
Kids: 2
Teens: 1
Adults: 1
Average Health: 85.0
Strongest Character: 
Chopper (Health 120)
*/

public class WeirderStuffTester {
  public static void main(String[] args) {
    Character.printStats();
    System.out.println("---------1-----------");
    Character twelve = new Character("Twelve", "Kid", 100);
    twelve.printDetails();
    System.out.println("---------2-----------");
    Character spike = new Character("Spike", "Kid", 50);
    spike.printDetails();
    System.out.println("---------3-----------");
    Character.printStats();
    System.out.println("---------4-----------");
    Character reeve = new Character("Reeve", 70);
    reeve.printDetails();
    System.out.println("---------5-----------");
    Character chopper = new Character("Chopper", "Adult", 120);
    chopper.printDetails();
    System.out.println("---------6-----------");
    Character.printStats();
  }
}