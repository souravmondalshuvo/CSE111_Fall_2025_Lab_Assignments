//HomeWorkTask02

public class Student {
    
    public int student_ID;
    public double cgpa;
    public String[] courses = new String[4];
    public int courses_count;

    public Student(int student_ID) {
        this.student_ID = student_ID;
        System.out.println("A student with ID " + student_ID + " has been created.");
    }

    public Student(int student_ID, double cgpa) {
        this.student_ID = student_ID;
        this.cgpa = cgpa;
        System.out.println("A student with ID " + student_ID + " and cgpa " + cgpa + " has been created.");
    }

    public void storeCG(double cgpa) {
        this.cgpa = cgpa;
    }

    public void storeID(int student_ID) {
        this.student_ID = student_ID;
    }

    public void addCourse(String course) {
        if(cgpa == 0.0) {
            System.out.println("Failed to add " + course);
            System.out.println("Set CG first");
            return;
        }
        if(cgpa < 3 && courses_count >= 3) {
            System.out.println("Failed to add " + course);
            System.out.println("CG is low. Can't add more than 3 courses.");
            return;
        }
        if(cgpa >= 3 && courses_count >= 4){
            System.out.println("Failed to add " + course);
            System.out.println("Maximum 4 courses allowed.");
            return;
        }

        courses[courses_count++] = course;
    }

    public void addCourse(String[] new_course) {
        for(int i = 0; i < new_course.length; i++) {
            addCourse(new_course[i]);
        }
    }

    public void removeAllCourse() {
        courses = new String[4];
        courses_count = 0;
    }

    public void showAdvisee() {
        System.out.println("Student ID: " + student_ID + ", CGPA: " + cgpa);
        
        if(courses_count == 0) {
            System.out.println("No courses added.");
        } else {
            System.out.println("Added courses are: ");
            for(int i = 0; i < courses_count; i++) {
                System.out.print(courses[i] + " ");
            }
            System.out.println();
        }
    }
}