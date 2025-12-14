/*
Task 4

Design the AnimalKeepers class with the following requirements:
The Animal Keepers have private IDs starting from 101.
The Safari has an array named, Animals = {“Lion”, “Tiger”, “Seal”, “Gorilla”, “Deer”} 
Only one task is assigned per animal and so the tasks are overridden when reassigned for the same animal.
[Hint: You can call the static method printTasks() from inside details()]

Tester Code
import java.util.Arrays;
public class KeeperTester {
  public static void main(String[] args) {
    Animalkeepers.details();
    System.out.println("---------1----------");
    System.out.println(Arrays.toString(Animalkeepers.Animals));
    System.out.println("---------2----------");
    Animalkeepers leo = new Animalkeepers("Leo");
    Animalkeepers theo = new Animalkeepers("Theo");
    Animalkeepers mochi = new Animalkeepers("Mochi");
    System.out.println("---------3----------");
    Animalkeepers.printTasks();
    System.out.println("---------4----------");
    leo.doTask("Lion", "Feed");
    System.out.println("---------5----------");
    leo.doTask("Monkey", "Feed");
    System.out.println("---------6----------");
    Animalkeepers.details();
    System.out.println("---------7----------");
    theo.doTask("Tiger", "Bathe");
    mochi.doTask("Seal", "Clean Pen");
    mochi.doTask("Deer", "Add Food");
    System.out.println("---------8----------");
    Animalkeepers.printTasks();
    System.out.println("---------9----------");
    leo.doTask("Deer", "Play");
    System.out.println("---------10----------");
    Animalkeepers.details();
  }
}

Output
No Animal Keepers working yet.
---------1----------
[Lion, Tiger, Seal, Gorilla, Deer]        
---------2----------
Leo with ID 101 got the job!
Theo with ID 102 got the job!
Mochi with ID 103 got the job!
---------3----------
No tasks assigned.
---------4----------
Task assigned to Leo
---------5----------
Animal not in the Safari
---------6----------
Total Animal Keeper: 3
Total Task assigned: 1
Feed (Keeper - Leo) === Lion
---------7----------
Task assigned to Theo
Task assigned to Mochi
Task assigned to Mochi
---------8----------
Feed (Keeper - Leo) === Lion
Bathe (Keeper - Theo) === Tiger
Clean Pen (Keeper - Mochi) === Seal       
Add Food (Keeper - Mochi) === Deer        
---------9----------
Task assigned to Leo
---------10----------
Total Animal Keeper: 3
Total Task assigned: 4
Feed (Keeper - Leo) === Lion
Bathe (Keeper - Theo) === Tiger
Clean Pen (Keeper - Mochi) === Seal       
Play (Keeper - Leo) === Deer
*/

import java.util.Arrays;

public class KeeperTester {
    public static void main(String[] args) {
        Animalkeepers.details();
        System.out.println("---------1----------");
        System.out.println(Arrays.toString(Animalkeepers.Animals));
        System.out.println("---------2----------");
        Animalkeepers leo = new Animalkeepers("Leo");
        Animalkeepers theo = new Animalkeepers("Theo");
        Animalkeepers mochi = new Animalkeepers("Mochi");
        System.out.println("---------3----------");
        Animalkeepers.printTasks();
        System.out.println("---------4----------");
        leo.doTask("Lion", "Feed");
        System.out.println("---------5----------");
        leo.doTask("Monkey", "Feed");
        System.out.println("---------6----------");
        Animalkeepers.details();
        System.out.println("---------7----------");
        theo.doTask("Tiger", "Bathe");
        mochi.doTask("Seal", "Clean Pen");
        mochi.doTask("Deer", "Add Food");
        System.out.println("---------8----------");
        Animalkeepers.printTasks();
        System.out.println("---------9----------");
        leo.doTask("Deer", "Play");
        System.out.println("---------10----------");
        Animalkeepers.details();
    }
}