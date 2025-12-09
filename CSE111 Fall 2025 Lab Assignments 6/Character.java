public class Character {
    
    public String name;
    public String group;
    public int ID;
    public int health;
    public static int total_character;
    public static int kid_count;
    public static int teen_count;
    public static int adult_count;
    public static int total_health;
    public static Character strongest = null;

    public Character(String name, String group, int health) {
        this.name = name;
        this.group = group;
        this.health = health;
        this.ID = ++total_character;

        if(group.equals("Kid")) {
            kid_count++;
        }
        
        if(group.equals("Teen")) {
            teen_count++;
        }

        if(group.equals("Adult")) {
            adult_count++;
        }

        total_health += health;

        if(strongest == null || health > strongest.health) {
            strongest = this;
        }
    }

    public Character(String name, int health) {
        this.name = name;
        this.health = health;

        if(health < 60) {
            group = "Kid";
        } else if(health < 100) {
            group = "Teen";
        } else {
            group = "Adult";
        }

        this.ID = ++total_character;

        if(group.equals("Kid")) {
            kid_count++;
        }
        
        if(group.equals("Teen")) {
            teen_count++;
        }

        if(group.equals("Adult")) {
            adult_count++;
        }        

        total_health += health;

        if(strongest == null || health > strongest.health) {
            strongest = this;
        }
    }

    public void printDetails() {
        System.out.println("ID: " + this.ID + ", Name: " + this.name);
        System.out.println("Group: " + this.group);
        System.out.println("Health: " + this.health);
    }

    public static void printStats() {
        System.out.println("Total Characters: " + total_character);
        System.out.println("Kids: " + kid_count);
        System.out.println("Teens: " + teen_count);
        System.out.println("Adults: " + adult_count);

        double average = 0;

        if(total_character > 0) {
            average = (double) total_health / total_character;
        }
        System.out.println("Average Health: " + average);

        System.out.print("Strongest Character: ");
        if(strongest == null) {
            System.out.println("None");
        } else {
            System.out.println();
            System.out.println(strongest.name + " (Health " + strongest.health + ")");
        }
    }
}