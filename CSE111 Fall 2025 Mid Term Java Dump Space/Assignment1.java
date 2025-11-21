import java.util.*;
public class Assignment1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num_1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        int num_2 = sc.nextInt();

        int min_value;
        int max_value;
        int count = 0;

        if(num_1 < num_2) {
            min_value = num_1;
            max_value = num_2;
        } else {
            min_value = num_2;
            max_value = num_1;
        }

        for(int i = min_value; i <= max_value; i++) {
            int prime_number = 1;

            if(i <= 1) {
                prime_number = 0;
            } else {
                for(int j = 2; j * j <= i; j++) {
                    if(i % j == 0) {
                        prime_number = 0;
                        break;
                    }
                }
            }

            if(prime_number == 1) {
                count++;
            }
        }

        System.out.println("There are " + count + " prime numbers between " + min_value + " and " + max_value + ".");
        
        sc.close();
    }
}