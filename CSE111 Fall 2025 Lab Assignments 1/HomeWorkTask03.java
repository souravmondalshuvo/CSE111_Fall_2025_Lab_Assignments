//HomeWorkTask03
import java.util.*;
public class HomeWorkTask03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int N = sc.nextInt();

        int[] number = new int[N];

        for (int i = 0; i<N; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i<N; i++) {
            int repeated_number = 0;
            for (int j = 0; j < i; j++) {
                if (number[i] == number[j]) {
                    repeated_number = 1;
                    break;
                }
            }

            if (repeated_number == 1) {
                continue;
            }

            int count = 0;
            for (int k = 0; k<N; k++) {
                if (number[i] == number[k]) {
                    count++;
                }
            }

            System.out.println(number[i]+" - "+count+" times");
        }

        sc.close();
    }
}
