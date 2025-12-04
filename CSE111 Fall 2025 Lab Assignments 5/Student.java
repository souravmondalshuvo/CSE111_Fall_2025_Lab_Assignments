//HomeWorkTask02

public class Student {
    
    public String name;
    public int ID;
    public double cgpa;

    public Student(String name, int ID, double cgpa) {
        this.name = name;
        this.ID = ID;
        this.cgpa = cgpa;
    }

    public void updateId(int ID) {
        this.ID = ID;
    }
}