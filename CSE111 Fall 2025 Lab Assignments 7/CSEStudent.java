//HomeWorkTask05

public class CSEStudent extends Student {
    
    public static String[] lab_courses = {"CSE110", "CSE111", "CSE220", "CSE221"};
    public static int student_count;

    public CSEStudent(String name, int id) {
        super(name, id);
        student_count++;
    }

    public void addLabBasedCourse(String course) {

        int i;

        for(i = 0; i < lab_courses.length; i++) {
            if(lab_courses[i].equals(course)) {
                break;
            }
        }

        if(i == lab_courses.length) {
            System.out.println("It is not a lab based course!");
            return;
        }

        if(!courses.contains(course)) {
            courses = courses + course + " ";
        }
    }

    public static void details() {
        System.out.println("Total CSE Students: " + student_count);
        System.out.println("Available Lab Based Courses: ");
        for(int i = 0; i < lab_courses.length; i++) {
            System.out.print(lab_courses[i] + " ");
        }
        System.out.println();
    }
}