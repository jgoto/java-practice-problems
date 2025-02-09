/* Take a grade (A, B, C, etc.) as input and print a corresponding message using a switch statement */

package Problems;
import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args){
        System.out.println("Enter your grade: ");
        Scanner scan = new Scanner(System.in);
        char grade = scan.nextLine().charAt(0);
        switch (grade) {
            case 'a':
            case 'A':
                System.out.println("You got an " + grade + " - Excellent!");
                break;
            case 'b':
            case 'B':
                System.out.println("Good job, you got an " + grade);
                break;
            case 'c':
            case 'C':
                System.out.println("You got a " + grade);
                break;
            case 'd':
            case 'D':
            case 'f':
            case 'F':
                System.out.println("Try better next time");
                break;
            default:
                System.out.println("Unrecognized grade");
                break;
        }
        scan.close();
    }
    
}
