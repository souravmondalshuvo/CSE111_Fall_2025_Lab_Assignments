//HomeWorkTask04

public class Animalkeepers {
 
    private String name;
    private int ID;
    private static String[] task_animals = new String[5];
    private static String[] task_name = new String[5];
    private static String[] task_keeper = new String[5];
    private static int ID_counter = 101;
    private static int keeper_counter;

    public static String[] Animals = {"Lion", "Tiger", "Seal", "Gorilla", "Deer"};

    public Animalkeepers(String name) {
        this.name = name;
        this.ID = ID_counter++;
        keeper_counter++;
        System.out.println(this.name + " with ID " + this.ID + " got the job!");
    }

    public void doTask(String animal, String tasks) {

        int index = -1;

        for(int i = 0; i < Animals.length; i++) {
            if(Animals[i].equals(animal)) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            System.out.println("Animal not in the Safari");
            return;
        }

        task_animals[index] = animal;
        task_name[index] = tasks;
        task_keeper[index] = name;

        System.out.println("Task assigned to " + this.name);
    }

    public static void printTasks() {

        int count = 0;

        for(int i = 0; i < Animals.length; i++) {
            if(task_animals[i] != null) {
                System.out.println(task_name[i] + " (Keeper - " + task_keeper[i] + " ) === " + task_animals[i]);
                count++;
            }
        }

        if(count == 0) {
            System.out.println("No tasks assigned.");
        }
    }

    public static void details() {

        if(keeper_counter == 0) {
            System.out.println("No Animal Keepers working yet.");
            return;
        }

        int task_counter = 0;

        for(int i = 0; i < task_animals.length; i++) {
            if(task_animals[i] != null) {
                task_counter++;
            }
        }

        System.out.println("Total Animal Keeper: " + keeper_counter);
        System.out.println("Total Task Assigned: " + task_counter);
        printTasks();
    }
}