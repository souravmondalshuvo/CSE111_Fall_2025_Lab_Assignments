//HomeWorkTask03

public class Artifact {
    
    private String name;
    private String added;
    private int power;
    private static Artifact[] vault = new Artifact[4];
    private static int artifact_count;
    
    public Artifact(String name, String added) {
        this.name = name;
        this.added = added;
        this.power = CalcPower();
    }

    public Artifact(String name) {
        this.name = name;
        this.added = "Okabe";
        this.power = CalcPower();
    }

    public String GetName() {
        return name;
    }

    public int CalcPower() {
        int sum = 0;

        if(name.length() % 2 == 0) {
            for(int i = 0; i < name.length(); i += 2) {
                sum += name.charAt(i);
            }
        } else {
            for(int i = 1; i < name.length(); i += 2) {
                sum += name.charAt(i);
            }
        }

        return sum;
    }

    public void revealArtifact() {
        System.out.println(this.name + " added by " + this.added + " has power of " + this.power + ".");
    }

    public void changeName(String new_name) {
        this.name = new_name;
        this.power = CalcPower();
        System.out.println("Name changed and power recalculated.");
    }

    public static void AddtoVault(Artifact artifact) {

        if(artifact_count < 4) {
            vault[artifact_count++] = artifact;
            System.out.println(artifact.added + " added " + artifact.name + " successfully to the vault.");
        } else {
            System.out.println("!!" + artifact.added + " unsuccessful in adding artifact to the vault!!");
        }
    }

    public static void labReport() {
        System.out.println("=== Future Gadget Lab ===");

        for(int i = 0; i < artifact_count; i++) {
            System.out.println(vault[i].name + " added by " + vault[i].added + " has power of " + vault[i].power);
        }
    }

    public static String strongest() {

        Artifact strongest = vault[0];

        for(int i = 1; i < artifact_count; i++) {
            if(vault[i].power > strongest.power) {
                strongest = vault[i];
            }
        }

        return strongest.name;
    }
}