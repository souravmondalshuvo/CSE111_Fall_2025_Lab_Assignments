/* 
Task 1
Design the Player class to obtain the following output from the driver code. You can assume, each player can defeat at most 5 villains.

Driver Code
public class PlayerTester {
  public static void main(String[] args) {
    Player ben = new Player("Ben", 10);
    System.out.println("======1======");
    ben.viewInfo();
    System.out.println("======2======");
    ben.defeatVillain("Vilgax", 100);
    System.out.println("======3======");
    ben.defeatVillain("Yamcha", 10);
    System.out.println("======4======");
    ben.viewInfo();
    System.out.println("======5======");
    ben.defeatVillain('8', "Vilgax", 100);
    System.out.println("======6======");
    ben.viewInfo();
    System.out.println("======7======");
    Player kevin = new Player("Kevin");
    System.out.println("======8======");
    kevin.viewInfo();
    System.out.println("======9======");
    ben.defeatVillain(kevin);
    System.out.println("======10======");
    ben.viewInfo();
    System.out.println("======11======");
    Player goku = new Player("Goku", 9000);
    System.out.println("======12======");
    ben.defeatVillain(goku);
  }
}

Expected Output
Ben joined the game
HP: 10
======1======
Player Name: Ben
Current HP: 10
======2======
failed to defeat Vilgax
======3======
defeated Yamcha
======4======
Player Name: Ben
Current HP: 20
Defeated:
Yamcha,
======5======
HP with 8x boost: 160
defeated Vilgax
======6======
Player Name: Ben
Current HP: 260
Defeated:
Yamcha, Vilgax,
======7======
Kevin joined the game
HP: 100
======8======
Player Name: Kevin
Current HP: 100
======9======
defeated Kevin
======10======
Player Name: Ben
Current HP: 360
Defeated:
Yamcha, Vilgax, Kevin,
======11======
Goku joined the game
HP: 9000
======12======
failed to defeat Goku
*/

public class PlayerTester {
  public static void main(String[] args) {
    Player ben = new Player("Ben", 10);
    System.out.println("======1======");
    ben.viewInfo();
    System.out.println("======2======");
    ben.defeatVillain("Vilgax", 100);
    System.out.println("======3======");
    ben.defeatVillain("Yamcha", 10);
    System.out.println("======4======");
    ben.viewInfo();
    System.out.println("======5======");
    ben.defeatVillain('8', "Vilgax", 100);
    System.out.println("======6======");
    ben.viewInfo();
    System.out.println("======7======");
    Player kevin = new Player("Kevin");
    System.out.println("======8======");
    kevin.viewInfo();
    System.out.println("======9======");
    ben.defeatVillain(kevin);
    System.out.println("======10======");
    ben.viewInfo();
    System.out.println("======11======");
    Player goku = new Player("Goku", 9000);
    System.out.println("======12======");
    ben.defeatVillain(goku);
  }
}