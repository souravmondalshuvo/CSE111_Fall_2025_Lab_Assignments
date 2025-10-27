//HomeWorkTask02 
import java.util.*;
public class HomeWorkTask02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string in lowercase: ");
        String word = sc.nextLine();

        if (!word.equals(word.toLowerCase())) {
            System.out.println("Please input the string in lowercase only.");
        } else {
            String final_word = "";

            for (int i = 0; i<word.length(); i++) {
                char ch = word.charAt(i);

                if (ch == 'a') {
                    final_word+='z';
                } else {
                    final_word+=(char) (ch - 1);
                }
            }

            System.out.println(final_word);
        }

        sc.close();
    }
}