//HomeWorkTask01

public class Employee {
    
    public String name;
    public int id;
    public String employee_category;

    public Employee() {
        System.out.println("A default employee has been created");
    }

    public Employee(String name, int id, String employee_category) {
        this.name = name;
        this.id = id;
        this.employee_category = employee_category;
    }
}