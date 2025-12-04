public class Department {
    
    public String department_name;
    public Student[] students;
    public int student_count;

    public Department(String department_name) {
        this.department_name = department_name;
        this.students = new Student[5];
    }

    public void addStudent(Student student) {

        boolean exist = false;

        for(int i = 0; i < student_count; i++) {
            if(students[i].ID == student.ID) {
                exist = true;
                break;
            }
        }

        if(exist) {
            System.out.println("Student with the same ID already exists, Please try with another ID");
        } else {
            if(student_count < 5) {
                students[student_count] = student;
                student_count++;
                System.out.println("Welcome to " + department_name + " department, " + student.name);
            } else {
                System.out.println("Department is full");
            }
        }
    }

    public void addStudent(Student student_1, Student student_2, Student student_3) {
        addStudent(student_1);
        addStudent(student_2);
        addStudent(student_3);
    }

    public void findStudent(int ID) {

        boolean exist = false;

        for(int i = 0; i < student_count; i++) {
            if(students[i].ID == ID) {
                System.out.println("Student info: ");
                System.out.println("Student Name: " + students[i].name);
                System.out.println("ID: " + students[i].ID);
                System.out.println("CGPA: " + students[i].cgpa);

                exist = true;
                break;
            }
        }

        if(!exist) {
            System.out.println("Student with this ID doesn't exist, Please give a valid ID");
        }
    }

    public void details() {
        System.out.println("Department Name: " + department_name);
        System.out.println("Number of student: " + student_count);
        
        System.out.println("Details of the students: ");
        for(int i = 0; i < student_count; i++) {
            System.out.println("Student Name: " + students[i].name + ", ID: " + students[i].ID + ", cgpa: " + students[i].cgpa);
        }
    }
}