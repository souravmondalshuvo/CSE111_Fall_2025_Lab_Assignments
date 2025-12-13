/*
Task 3

Design the Artifact class where all the attributes of the class are classified i.e. private. The “Vault” can only store a maximum of 4 artifacts. The power of the artifacts are calculated as: For artifact with,
Even length name => Summation of all characters in even index of name.
Odd length name => Summation of all characters in odd index of name.

Tester Code

public class TesterArtifact{
  public static void main(String[] args) {
    Artifact a = new Artifact("Phone Microwave", "Kurisu");
    System.out.println("--------1-------");
    Artifact.AddtoVault(a);
    Artifact.AddtoVault(new Artifact("D-Mail Capsule", "Mayuri"));
    System.out.println("--------2-------");
    Artifact c = new Artifact("C204 Chip");
    Artifact d = new Artifact("Divergence Meter"); 
    Artifact e = new Artifact("M4A2 Robot", "Okabe");
    Artifact.AddtoVault(c);
    Artifact.AddtoVault(d);
    Artifact.AddtoVault(e);
    System.out.println("--------3-------");
    Artifact.labReport();
    System.out.println("--------4-------");
    System.out.println("Power of "+c.GetName()+" is "+c.CalcPower());
    System.out.println("--------5-------");
    System.out.println("Strongest Artifact: "+Artifact.strongest());
    System.out.println("--------6-------");
    a.revealArtifact();
    System.out.println("--------7-------");
    a.changeName("Banana Microwave");
    System.out.println("--------8-------");
    Artifact.labReport();
    System.out.println("--------9-------");
    System.out.println("Strongest Artifact: "+Artifact.strongest());
  }
}

Output
--------1-------
Kurisu added Phone Microwave successfully to the vault.
Mayuri added D-Mail Capsule successfully to the vault.
--------2-------
Okabe added C204 Chip successfully to the vault.
Okabe added Divergence Meter successfully to the vault.
!!Okabe unsuccessful in adding artifact to the vault!!
--------3-------
=== Future Gadget Lab ===
Phone Microwave added by Kurisu has power of 702.
D-Mail Capsule added by Mayuri has power of 602.
C204 Chip added by Okabe has power of 274.
Divergence Meter added by Okabe has power of 734.
--------4-------
Power of C204 Chip is 274
--------5-------
Strongest Artifact: Divergence Meter
--------6-------
Phone Microwave added by Kurisu has power of 702.
--------7-------
Name changed and power recalculated.
--------8-------
=== Future Gadget Lab ===
Banana Microwave added by Kurisu has power of 774.
D-Mail Capsule added by Mayuri has power of 602.
C204 Chip added by Okabe has power of 274.
Divergence Meter added by Okabe has power of 734.
--------9-------
Strongest Artifact: Banana Microwave
*/

public class TesterArtifact{
  public static void main(String[] args) {
    Artifact a = new Artifact("Phone Microwave", "Kurisu");
    System.out.println("--------1-------");
    Artifact.AddtoVault(a);
    Artifact.AddtoVault(new Artifact("D-Mail Capsule", "Mayuri"));
    System.out.println("--------2-------");
    Artifact c = new Artifact("C204 Chip");
    Artifact d = new Artifact("Divergence Meter"); 
    Artifact e = new Artifact("M4A2 Robot", "Okabe");
    Artifact.AddtoVault(c);
    Artifact.AddtoVault(d);
    Artifact.AddtoVault(e);
    System.out.println("--------3-------");
    Artifact.labReport();
    System.out.println("--------4-------");
    System.out.println("Power of "+c.GetName()+" is "+c.CalcPower());
    System.out.println("--------5-------");
    System.out.println("Strongest Artifact: "+Artifact.strongest());
    System.out.println("--------6-------");
    a.revealArtifact();
    System.out.println("--------7-------");
    a.changeName("Banana Microwave");
    System.out.println("--------8-------");
    Artifact.labReport();
    System.out.println("--------9-------");
    System.out.println("Strongest Artifact: "+Artifact.strongest());
  }
}