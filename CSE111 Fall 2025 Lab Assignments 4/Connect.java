//HomeWorkTask03

public class Connect {
    
    public int total_advisee;
    public Student[] advisees;

    public Connect() {
        this.advisees = new Student[5];
        System.out.println("Connect is ready to use!");
    }

    public void login(Student student) {
        if(student.email == null || student.password == null) {
            System.out.println("Email and password need to be set.");
        } else {
            student.logged_in = true;
            System.out.println("Login successful");
        }
    }

    public void advising(Student student) {
        if(!student.logged_in) {
            System.out.println("Please login to advise courses!");
            return;
        }

        if(total_advisee < 5) {
            boolean added = false;

            for(int i = 0; i < total_advisee; i++) {
                if(advisees[i] == student) {
                    added = true;
                    break;
                }
            }

            if(!added) {
                advisees[total_advisee++] = student;
            }
        }

        if(student.advised_courses == null || student.advised_courses.length == 0) {
            System.out.println("You haven't selected any courses.");
        } else {
            System.out.println("Advising successful!");
        }
    }

    public void advising(Student student, String course1) {
        advising(student, new String[]{course1});
    }

    public void advising(Student student, String course1, String course2) {
        advising(student, new String[]{course1, course2});
    }

    public void advising(Student student, String course1, String course2, String course3) {
        advising(student, new String[]{course1, course2, course3});
    }

    public void advising(Student student, String course1, String course2, String course3, String course4) {
        advising(student, new String[]{course1, course2, course3, course4});
    }

    public void advising(Student student, String[] course) {
        if(!student.logged_in) {
            System.out.println("Please login to advise courses!");
            return;
        }

        if(course.length > 3) {
            System.out.println("You need special approval to take more than 3 courses.");
            return;
        }

        student.advised_courses = course;

        if(total_advisee < 5) {
            boolean added = false;

            for(int i = 0; i < total_advisee; i++) {
                if(advisees[i] == student) {
                    added = true;
                    break;
                }
            }

            if(!added) {
                advisees[total_advisee++] = student;
            }
        }

        System.out.println("Advising successful!");
    }

    public void allAdviseeInfo() {
        System.out.println("Total Advisee: " + total_advisee);

        for(int i = 0; i < total_advisee; i++) {
            Student student = advisees[i];
            System.out.println("Name: " + student.name + " ID: " + student.student_ID);
            System.out.println("Department: " + student.department);
            System.out.println("Advised Courses: ");
            for(int j = 0; j < student.advised_courses.length; j++) {
                System.out.print(student.advised_courses[j] + " ");
            }
            
            System.out.println("\n==============");
        }
    }
}