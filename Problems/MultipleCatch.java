/* Use multiple catch blocks to handle NullPointerException and NumberFormatException. */

package Problems;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.println("Enter a number: ");
            int a = scan.nextInt();
            //scan.close();
            System.out.println("Enter another number: ");
            int b = scan.nextInt();
            System.out.printf("%d / %d = %d\n", a, b, a/b);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Something went wrong");
        } finally {
            scan.close();
        }
    }
}
