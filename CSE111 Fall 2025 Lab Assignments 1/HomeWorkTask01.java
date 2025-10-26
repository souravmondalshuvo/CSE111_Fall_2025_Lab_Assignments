//HomeWorkTask01
import java.util.*;
public class HomeWorkTask01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int first_number = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int second_number = sc.nextInt();

        int min_value;
        int max_value;

        int prime_number_counter = 0;

        if (first_number < second_number) {
            min_value = first_number;
            max_value = second_number;
        } else {
            min_value = second_number;
            max_value = first_number;
        }

        for (int i = min_value; i<=max_value; i++) {
            int prime_number = 1;

            if (i<=1) {
                prime_number = 0;
            } else {
                for (int j = 2; j * j<=i; j++) {
                    if (i % j == 0) {
                        prime_number = 0;
                        break;
                    }
                    
                }
            }

            if (prime_number == 1) {
                prime_number_counter++;
            }
        
        }
        
        System.out.println("There are "+prime_number_counter+" prime numbers between "+min_value+" and "+max_value+".");

        sc.close();
    }
}