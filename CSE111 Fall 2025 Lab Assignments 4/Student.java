//HomeWorkTask03

public class Student {
    
    public String name;
    public int student_ID;
    public String department;
    public String email;
    public String password;
    public boolean logged_in;
    public String[] advised_courses;

    public Student(String name, int student_ID, String department) {
        this.name = name;
        this.student_ID = student_ID;
        this.department = department;
        System.out.println("Student object is created");
    }
}