/* Take user input for their name and age, then print a greeting message */

package Problems;
import java.util.Scanner;

public class greeting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = scanner.nextLine();
        System.out.print("What is your Age: ");
        String age = scanner.nextLine();
        System.out.printf("Hello %s you are %s years old", name, age);
        scanner.close();        
    }    
}
