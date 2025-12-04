public class Company {
    
    public String company_name = "ABC Company";
    public int employee_count;
    public Employee[] employees = new Employee[3];

    public void addEmployee(Employee employee) {
        
        if(employee_count < employees.length) {
            employees[employee_count] = employee;
            employee_count++;
            System.out.println(employee.name + " has joined the company");
        } else {
            System.out.println("No more vacancy");
        }
    }

    public void removeEmployee(Employee employee) {
        
        int count = -1;

        for(int i = 0; i < employee_count; i++) {
            if(employees[i] == employee) {
                count = i;
                break;
            }
        }

        if(count != -1) {
            System.out.println(employees[count].name + " has left the company");

            for(int i = count; i < employee_count - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[employee_count - 1] = null;
            employee_count--;
        }
    }

    public void details() {

        System.out.println("Company Name: " + company_name);
        System.out.println("Total Employee: " + employee_count);
        
        System.out.println("Fulltime Employees: ");
        for(int i = 0; i < employee_count; i++) {
            if(employees[i].employee_category.equals("Fulltime")){
                System.out.println("Name: " + employees[i].name + ", ID: " + employees[i].id);
            }
        }

        System.out.println("Part-Time Employees: ");
        for(int i = 0; i < employee_count; i++) {
            if(employees[i].employee_category.equals("Part-time")){
                System.out.println("Name: " + employees[i].name + ", ID: " + employees[i].id);
            }   
        }
    }
}