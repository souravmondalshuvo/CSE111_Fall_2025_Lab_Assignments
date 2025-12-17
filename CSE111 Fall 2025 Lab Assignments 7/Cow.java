//HomeWorkTask01

public class Cow extends Animal {
    
    public String name;

    public Cow() {
        System.out.println("The cow says hello!");
    }

    public String getName(String name) {
        return name;
    }

    public void updateSound(String sound) {
        this.sound = sound;
    }
}